package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class PageQuery {

    @ApiModelProperty("请求页码")
    private Integer pageNo = 1;

    @ApiModelProperty("分页大小")
    private Integer pageSize = 10;

    @ApiModelProperty("排序字段")
    private String orderColumn;

    @ApiModelProperty("排序方式 desc 倒序，默认正序")
    private String orderType;
}
