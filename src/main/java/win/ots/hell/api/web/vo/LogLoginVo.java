package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-28
 */
@Data
public class LogLoginVo {

    @ApiModelProperty("登录用户id")
    private Long userId;

    @ApiModelProperty("登录ip")
    private String ip;

    @ApiModelProperty("登录设备")
    private String device;
}
