package win.ots.hell.api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import win.ots.hell.api.entity.RelationRolePermission;
import win.ots.hell.api.repository.PermissionRepository;
import win.ots.hell.api.repository.RelationRolePermissionRepository;
import win.ots.hell.api.repository.RoleRepository;
import win.ots.hell.api.service.RelationRolePermissionService;
import win.ots.hell.api.util.BusinessException;
import win.ots.hell.api.web.vo.RelationRolePermissionVo;

import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Slf4j
@Service
public class RelationRolePermissionServiceImpl implements RelationRolePermissionService {

    @Autowired
    private RelationRolePermissionRepository relationRolePermissionRepository;
    @Autowired
    private PermissionRepository permissionRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RelationRolePermission findOne(Long id) {
        return relationRolePermissionRepository.findById(id).orElse(null);
    }

    @Override
    public RelationRolePermission saveOrUpdate(RelationRolePermission relationRolePermission) {
        return relationRolePermissionRepository.save(relationRolePermission);
    }

    @Override
    public int delete(RelationRolePermission relationRolePermission) {
        relationRolePermissionRepository.delete(relationRolePermission);
        return 1;
    }

    @Override
    public RelationRolePermissionVo bindRolePermission(RelationRolePermissionVo vo) {

        Long roleId = vo.getRoleId();
        if (!roleRepository.findById(roleId).isPresent()) {
            throw new BusinessException("ID [{}] 没有对应的角色，请重新输入", roleId);
        }
        Set<Long> permissionIds = vo.getPermissionIds();
        permissionIds.stream()
                .filter(id -> permissionRepository.findById(id).isPresent())
                .forEach(id -> {
                    RelationRolePermission relation = new RelationRolePermission();
                    relation.setRoleId(roleId);
                    relation.setPermissionId(id);
                    this.saveOrUpdate(relation);
                });
        return vo;
    }
}
