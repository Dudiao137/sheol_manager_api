package win.ots.sheol.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: sy.wang
 * @date: 2019-11-27
 */
@Data
public class DiaryVo {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("日记标题")
    private String title;

    @ApiModelProperty("简介")
    private String brief;

    @ApiModelProperty("日记内容")
    private String body;

    @ApiModelProperty("状态")
    private Integer status;
}
