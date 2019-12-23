package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: sy.wang
 * @date: 2019-11-28
 */
@Data
public class LogQueryVo extends PageQuery {

    @ApiModelProperty("查询用户id")
    List<Long> userIds;
}
