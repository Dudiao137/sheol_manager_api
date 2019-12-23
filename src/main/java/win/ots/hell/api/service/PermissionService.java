package win.ots.hell.api.service;

import win.ots.hell.api.core.base.BaseService;
import win.ots.hell.api.entity.Permission;
import win.ots.hell.api.web.vo.PermissionVo;

import java.util.List;
import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface PermissionService extends BaseService<Permission> {

    /**
     * 根据父权限ID获取子权限列表
     * @param parentId
     * @return
     */
    List<PermissionVo> findAllByParentId(long parentId);

    /**
     * 新增权限
     * @param vo
     * @return
     */
    PermissionVo add(PermissionVo vo);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteByIds(Set<Long> ids);
}
