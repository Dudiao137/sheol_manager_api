package win.ots.hell.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import win.ots.hell.api.util.Result;

import java.util.Date;

/**
 * @author: sy.wang
 * @date: 2019-11-25
 */
@Api("数据统计")
@RestController
@RequestMapping("/v0.1/statistics")
public class StatisticsController {

    @ApiOperation("获取地府鬼物总数")
    @RequestMapping("/count/all")
    public Result<Integer> countAll() {
        return Result.success(null);
    }

    @ApiOperation("获取入的数目")
    @RequestMapping("/count/in")
    public Result<Integer> countIn(@RequestParam("start") @ApiParam("计算开始时间") Date start,
                                   @RequestParam("end") @ApiParam("计算结束日期") Date end) {

        return Result.success(null);
    }

    @ApiOperation("获取出的数目")
    @RequestMapping("/count/out")
    public Result<Integer> countOut(@RequestParam("start") @ApiParam("计算开始时间") Date start,
                                   @RequestParam("end") @ApiParam("计算结束日期") Date end) {

        return Result.success(null);
    }

    @ApiOperation("获取某层的数目")
    @RequestMapping("/count/level/{level}")
    public Result<Integer> countLevel(@PathVariable("level") @ApiParam("地府层数") Integer level) {

        return Result.success(null);
    }

    @ApiOperation("获取汇率数据")
    @RequestMapping("/exchange_rate")
    public Result<Float> exchangeRage() {

        return Result.success(null);
    }



}
