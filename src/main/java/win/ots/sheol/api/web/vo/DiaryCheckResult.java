package win.ots.sheol.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-27
 */
@Data
public class DiaryCheckResult {

    @ApiModelProperty("审核结果 up / down")
    private String result;

    @ApiModelProperty("备注")
    private String remark;
}
