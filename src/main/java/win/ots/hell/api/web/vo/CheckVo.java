package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Pattern;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class CheckVo {
    @ApiModelProperty("验证码类型 0 登录， 1 重置， 2 批量删除")
    private Integer checkType;

    @ApiModelProperty("获取验证码时的id，与code一一对应")
    private String checkId;

    @ApiModelProperty("验证码")
    private String checkCode;

    @ApiModelProperty("手机号")
    @Pattern(regexp = "^1[3-9]\\d{9}", message = "手机号不正确，请输入11位手机号")
    private String mobile;
}
