package win.ots.hell.api.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import win.ots.hell.api.entity.Role;
import win.ots.hell.api.repository.PermissionRepository;
import win.ots.hell.api.repository.RoleRepository;
import win.ots.hell.api.service.RoleService;
import win.ots.hell.api.web.vo.RoleVo;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Slf4j
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Role findOne(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role saveOrUpdate(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public int delete(Role role) {
        roleRepository.delete(role);
        return 1;
    }

    @Override
    public List<RoleVo> findAll() {
        List<Role> all = roleRepository.findAll();
        return all.stream().map(item -> RoleVo.fromEntity(item)).collect(Collectors.toList());
    }

    @Override
    public RoleVo add(RoleVo vo) {
        Role role = roleRepository.save(RoleVo.toEntity(vo));
        return RoleVo.fromEntity(role);
    }

    @Override
    public int deleteByIds(Set<Long> ids) {
        roleRepository.deleteAllByIdIn(ids);
        return 1;
    }


}
