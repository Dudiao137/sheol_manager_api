package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: sy.wang
 * @date: 2019-11-27
 */
@Data
public class EventVo {

    @ApiModelProperty("创建者id")
    private Long userId;

    @ApiModelProperty("待办标题")
    private String title;

    @ApiModelProperty("待办事项")
    private String body;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("相关人列表")
    private List<Long> partner_ids;
}
