package win.ots.sheol.api.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
public class EquipmentVo {

    @ApiModelProperty("设备名称")
    private String name;

    @ApiModelProperty("使用者id")
    private Long handlerId;

    @ApiModelProperty("设备状态")
    private Integer status;

    @ApiModelProperty("已使用年限")
    private Integer years;

    @ApiModelProperty("图片url")
    private String image;

}
