package win.ots.hell.api.service;

import win.ots.hell.api.core.base.BaseService;
import win.ots.hell.api.entity.RelationUserRole;
import win.ots.hell.api.web.vo.RelationUserRoleVo;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface RelationUserRoleService extends BaseService<RelationUserRole> {

    /**
     * 绑定用户 角色关系
     * @param vo
     * @return
     */
    RelationUserRoleVo bindUserRole(RelationUserRoleVo vo);
}
