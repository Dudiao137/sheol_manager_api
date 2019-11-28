package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class OrderQueryVo extends PageQuery {
    @ApiModelProperty("产品id")
    private Long productId;

    @ApiModelProperty("操作员id")
    private Long handlerId;

    @ApiModelProperty("状态")
    private Integer status;
}
