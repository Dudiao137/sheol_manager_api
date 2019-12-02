package win.ots.hell.api.service;

import win.ots.hell.api.core.base.BaseService;
import win.ots.hell.api.entity.Role;
import win.ots.hell.api.web.vo.RoleVo;

import java.util.List;
import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface RoleService extends BaseService<Role> {
    /**
     * 查询所有数据
     * @return
     */
    List<RoleVo> findAll();

    /**
     * 新增
     * @param vo
     * @return
     */
    RoleVo add(RoleVo vo);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteByIds(Set<Long> ids);
}
