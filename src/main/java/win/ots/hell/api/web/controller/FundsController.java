package win.ots.hell.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import win.ots.hell.api.util.Result;
import win.ots.hell.api.web.vo.FundsTransferVo;
import win.ots.hell.api.web.vo.PageQuery;

/**
 * @author : sy.wang
 * @date : 2019-11-27
 */
@Api("用户金钱管理")
@RestController
@RequestMapping("/v0.1/funds")
public class FundsController {

    @ApiOperation("获取用户资产")
    @RequestMapping(value = "/account/users/{user_id}", method = RequestMethod.GET)
    public Result<Long> account(@PathVariable("user_id") @ApiParam("用户id") Long userId) {
        return Result.success(null);
    }

    @ApiOperation("分页获取转入账记录列表")
    @RequestMapping(value = "/transfer/users/{user_id}/in", method = RequestMethod.POST)
    public Result<Page<FundsTransferVo>> queryRecordIn(@PathVariable("user_id") @ApiParam("用户id") Long userId,
                                                       @RequestBody @ApiParam("查询vo") PageQuery query) {
        return Result.success(null);
    }

    @ApiOperation("分页获取转出账记录列表")
    @RequestMapping(value = "/transfer/users/{user_id}/out", method = RequestMethod.POST)
    public Result<Page<FundsTransferVo>> queryRecordOut(@PathVariable("user_id") @ApiParam("用户id") Long userId,
                                                       @RequestBody @ApiParam("查询vo") PageQuery query) {
        return Result.success(null);
    }

}
