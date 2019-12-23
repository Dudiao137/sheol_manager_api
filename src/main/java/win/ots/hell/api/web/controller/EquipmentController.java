package win.ots.hell.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import win.ots.hell.api.constant.Constant;
import win.ots.hell.api.util.Result;
import win.ots.hell.api.web.vo.EquipChangeRecordVo;
import win.ots.hell.api.web.vo.EquipUseRecordVo;
import win.ots.hell.api.web.vo.EquipmentQueryVo;
import win.ots.hell.api.web.vo.EquipmentVo;

import javax.validation.Valid;
import java.util.Random;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Api("设备管理")
@RestController
@RequestMapping("/v0.1/equipments")
public class EquipmentController {

    @ApiOperation("分页查询列表")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<Page<EquipmentVo>> query(@RequestBody @Valid EquipmentQueryVo queryVo) {
        return Result.success(null);
    }

    @ApiOperation("分页查询使用记录列表")
    @RequestMapping(value = "/query/uses", method = RequestMethod.GET)
    public Result<Page<EquipUseRecordVo>> queryUse(@RequestParam("equip_id") @ApiParam("设备id") Long equipId,
                                                   @RequestParam("handler_id") @ApiParam("使用者id") Long handlerId) {
        return Result.success(null);
    }

    @ApiOperation("分页查询修改记录列表")
    @RequestMapping(value = "/query/change", method = RequestMethod.GET)
    public Result<Page<EquipChangeRecordVo>> queryChange(@RequestParam("equip_id") @ApiParam("设备id") Long equipId,
                                                         @RequestParam("handler_id") @ApiParam("使用者id") Long handlerId) {
        return Result.success(null);
    }

    @ApiModelProperty("修改设备状态")
    @RequestMapping("/{equip_id}")
    public Result<EquipmentVo> setStatus(@PathVariable("equip_id") @ApiParam("设备id") Integer equipId,
                                         @RequestParam("status") @ApiParam("设备状态") Integer status) {
        return Result.success(null);
    }

    @ApiModelProperty("轮回")
    @RequestMapping("/cycle/next")
    public Result<Integer> getNextLevel(@RequestParam("product_id") @ApiParam("产品id") Integer productId) {
        Integer next = new Random().nextInt(Constant.MAX_LEVEL_OF_HEEL);
        return Result.success(next);
    }

}
