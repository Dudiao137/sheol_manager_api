package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import win.ots.hell.api.entity.Permission;

import javax.validation.constraints.NotEmpty;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Data
public class PermissionVo {

    @ApiModelProperty("id")
    private Long id;

    @NotEmpty
    @ApiModelProperty("权限名称")
    private String name;

    @NotEmpty
    @ApiModelProperty("父权限id")
    private Long parentId;

    @ApiModelProperty("父权限名称")
    private String parentName;

    public static Permission toEntity(PermissionVo vo) {
        Permission permission = new Permission();
        BeanUtils.copyProperties(vo, permission);
        return permission;
    }

    public static PermissionVo fromEntity(Permission permission) {
        PermissionVo permissionVo = new PermissionVo();
        BeanUtils.copyProperties(permission, permissionVo);
        return permissionVo;
    }
}
