package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import win.ots.hell.api.entity.Role;

import javax.validation.constraints.NotEmpty;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Data
public class RoleVo {

    @ApiModelProperty("id")
    private Long id;

    @NotEmpty
    @ApiModelProperty("角色名称")
    private String name;

    @NotEmpty
    @ApiModelProperty("角色标识")
    private String code;


    public static Role toEntity(RoleVo vo) {
        Role role = new Role();
        BeanUtils.copyProperties(vo, role);
        return role;
    }

    public static RoleVo fromEntity(Role role) {
        RoleVo roleVo = new RoleVo();
        BeanUtils.copyProperties(role, roleVo);
        return roleVo;
    }
}
