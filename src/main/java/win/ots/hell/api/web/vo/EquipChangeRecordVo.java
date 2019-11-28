package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class EquipChangeRecordVo {
    @ApiModelProperty("设备id")
    private Long equipId;

    @ApiModelProperty("修改者id")
    private Long handlerId;

    @ApiModelProperty("修改时间")
    private Date time;

    @ApiModelProperty("修改内容")
    private String record;

}
