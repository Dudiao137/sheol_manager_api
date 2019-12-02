package win.ots.hell.api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import win.ots.hell.api.entity.RelationUserRole;
import win.ots.hell.api.repository.RelationUserRoleRepository;
import win.ots.hell.api.repository.RoleRepository;
import win.ots.hell.api.repository.UserRepository;
import win.ots.hell.api.service.RelationUserRoleService;
import win.ots.hell.api.util.BusinessException;
import win.ots.hell.api.web.vo.RelationUserRoleVo;

import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Slf4j
@Service
public class RelationUserRoleServiceImpl implements RelationUserRoleService {

    @Autowired
    private RelationUserRoleRepository relationUserRoleRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RelationUserRole findOne(Long id) {
        return relationUserRoleRepository.findById(id).orElse(null);
    }

    @Override
    public RelationUserRole saveOrUpdate(RelationUserRole relationUserRole) {
        return relationUserRoleRepository.save(relationUserRole);
    }

    @Override
    public int delete(RelationUserRole relationUserRole) {
        relationUserRoleRepository.delete(relationUserRole);
        return 1;
    }

    @Override
    public RelationUserRoleVo bindUserRole(RelationUserRoleVo vo) {
        Long userId = vo.getUserId();
        if (!userRepository.findById(userId).isPresent()) {
            throw new BusinessException("ID [{}] 没有对应的用户，请重新输入", userId);
        }
        Set<Long> roleIds = vo.getRoleIds();
        roleIds.stream()
                .filter(id -> userRepository.findById(id).isPresent())
                .forEach(id -> {
                    RelationUserRole relation = new RelationUserRole();
                    relation.setUserId(userId);
                    relation.setRoleId(id);
                    this.saveOrUpdate(relation);
                });
        return vo;
    }
}
