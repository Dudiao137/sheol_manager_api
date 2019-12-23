package win.ots.hell.api.service;

import win.ots.hell.api.core.base.BaseService;
import win.ots.hell.api.entity.RelationRolePermission;
import win.ots.hell.api.web.vo.RelationRolePermissionVo;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface RelationRolePermissionService extends BaseService<RelationRolePermission> {

    /**
     * 绑定角色 权限关系
     *
     * @param vo
     * @return
     */
    RelationRolePermissionVo bindRolePermission(RelationRolePermissionVo vo);
}
