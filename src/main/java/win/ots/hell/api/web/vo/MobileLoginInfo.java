package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-23
 */
@Data
public class MobileLoginInfo {

    @ApiModelProperty("用户手机号")
    private String mobile;

    @ApiModelProperty("验证码")
    private String code;
}
