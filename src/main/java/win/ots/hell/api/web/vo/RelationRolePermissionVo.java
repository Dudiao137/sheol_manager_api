package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Data
public class RelationRolePermissionVo {

    @NotNull
    @ApiModelProperty("用户id")
    private Long roleId;

    @ApiModelProperty("角色列表，可为空")
    private Set<Long> permissionIds;

}
