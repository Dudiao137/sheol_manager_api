package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-28
 */
@Data
public class LogActionVo {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("操作内容")
    private String remark;

}
