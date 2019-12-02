package win.ots.hell.api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import win.ots.hell.api.entity.Permission;
import win.ots.hell.api.repository.PermissionRepository;
import win.ots.hell.api.service.PermissionService;
import win.ots.hell.api.web.vo.PermissionVo;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Slf4j
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Permission findOne(Long id) {
        return permissionRepository.findById(id).orElse(null);
    }

    @Override
    public Permission saveOrUpdate(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public int delete(Permission permission) {
        permissionRepository.delete(permission);
        return 1;
    }

    @Override
    public List<PermissionVo> findAllByParentId(long parentId) {
        List<Permission> permissions = permissionRepository.findAllByParentId(parentId);
        return permissions.stream().map(item -> PermissionVo.fromEntity(item))
                .collect(Collectors.toList());
    }

    @Override
    public PermissionVo add(PermissionVo vo) {
        Permission permission = PermissionVo.toEntity(vo);
        return PermissionVo.fromEntity(permissionRepository.save(permission));
    }

    @Override
    public int deleteByIds(Set<Long> ids) {
        permissionRepository.deleteAllByIdIn(ids);
        return 1;
    }
}
