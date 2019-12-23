package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-23
 */
@Data
public class UserLogin {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户密码")
    private String password;
}
