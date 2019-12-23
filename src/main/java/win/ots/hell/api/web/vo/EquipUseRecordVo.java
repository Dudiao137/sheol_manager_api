package win.ots.hell.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class EquipUseRecordVo {
    @ApiModelProperty("设备id")
    private Long equipId;

    @ApiModelProperty("使用者id")
    private Long handlerId;

    @ApiModelProperty("使用时间")
    private Date time;

}
