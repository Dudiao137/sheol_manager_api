package win.ots.hell.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import win.ots.hell.api.util.Result;
import win.ots.hell.api.web.vo.PermissionVo;
import win.ots.hell.api.web.vo.RelationRolePermissionVo;
import win.ots.hell.api.web.vo.RelationUserRoleVo;
import win.ots.hell.api.web.vo.RoleVo;

import javax.validation.Valid;
import java.util.List;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Api("权限相关设置")
@RestController
@RequestMapping("/v0.1/security")
public class SecurityController {

    @ApiOperation("获取所有角色列表")
    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public Result<List<RoleVo>> getAllRoles() {
        return Result.success(null);
    }

    @ApiOperation("新增角色")
    @RequestMapping(value = "/roles/add", method = RequestMethod.POST)
    public Result<RoleVo> addRole(@RequestBody @Valid @ApiParam("角色Vo") RoleVo vo) {

        return Result.success(null);
    }

    @ApiOperation("获取所有顶级权限列表")
    @RequestMapping(value = "/permissions/parents", method = RequestMethod.GET)
    public Result<List<PermissionVo>> getAllParentPermissions() {

        return Result.success(null);
    }

    @ApiOperation("获取权限列表")
    @RequestMapping(value = "/permissions/parents/{parent_id}", method = RequestMethod.GET)
    public Result<List<PermissionVo>> getAllParentPermissions(@PathVariable("parent_id") @ApiParam("父类id") Integer parentId) {

        return Result.success(null);
    }

    @ApiOperation("新增权限")
    @RequestMapping(value = "/permissions/add", method = RequestMethod.POST)
    public Result<PermissionVo> addPermission(@RequestBody @Valid @ApiParam("权限Vo") PermissionVo vo) {

        return Result.success(null);
    }

    @ApiOperation("更新角色权限绑定关系")
    @RequestMapping(value = "/roles/permissions/bind", method = RequestMethod.POST)
    public Result<RelationUserRoleVo> bindRolePermission(@RequestBody @Valid @ApiParam("角色权限绑定关系") RelationUserRoleVo vo) {

        return Result.success(null);
    }

    @ApiOperation("更新用户角色绑定关系")
    @RequestMapping(value = "/users/roles/bind", method = RequestMethod.POST)
    public Result<RelationRolePermissionVo> bindUserRole(@RequestBody @Valid @ApiParam("用户角色绑定关系") RelationRolePermissionVo vo) {

        return Result.success(null);
    }

    @ApiOperation("删除角色列表")
    @RequestMapping(value = "/roles/delete", method = RequestMethod.DELETE)
    public Result<String> deleteRole(@RequestBody @ApiParam("角色ID列表") List<Long> ids) {

        return Result.success(null);
    }

    @ApiOperation("删除权限列表, 删除顶级权限会递增删除子权限")
    @RequestMapping(value = "/permissions/delete", method = RequestMethod.DELETE)
    public Result<String> deletePermission(@RequestBody @ApiParam("权限ID列表") List<Long> ids) {

        return Result.success(null);
    }


}
