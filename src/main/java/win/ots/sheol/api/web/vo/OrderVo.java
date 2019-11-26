package win.ots.sheol.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class OrderVo {

    @ApiModelProperty("商品id")
    private Long productUpId;

    @ApiModelProperty("商品id")
    private Long productDownId;

    @ApiModelProperty("操作员id")
    private List<Long> handlerId;

    @ApiModelProperty("商品状态")
    private Integer status;
}
