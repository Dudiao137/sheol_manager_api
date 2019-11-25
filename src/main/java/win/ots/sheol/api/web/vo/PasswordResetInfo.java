package win.ots.sheol.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-23
 */
@Data
public class PasswordResetInfo {

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("验证码")
    private String code;
}
