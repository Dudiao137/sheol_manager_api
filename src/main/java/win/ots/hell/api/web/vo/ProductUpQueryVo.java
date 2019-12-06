package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class ProductUpQueryVo extends PageQuery {

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("类目")
    private Integer category;

    @ApiModelProperty("死亡方式")
    private Integer deadType;


}
