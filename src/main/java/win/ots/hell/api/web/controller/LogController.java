package win.ots.hell.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import win.ots.hell.api.util.Result;
import win.ots.hell.api.web.vo.LogLoginVo;
import win.ots.hell.api.web.vo.LogQueryVo;

import javax.validation.Valid;

/**
 * @author: sy.wang
 * @date: 2019-11-28
 */
@Api("日志查询")
@RestController
@RequestMapping("/v0.1/logs")
public class LogController {

    @ApiOperation("登录日志查询")
    @RequestMapping(value = "login/query", method = RequestMethod.POST)
    public Result<Page<LogLoginVo>> loginLogQuery(@RequestBody @ApiParam("查询条件") @Valid LogQueryVo queryVo) {
        return Result.success(null);
    }


    @ApiOperation("操作日志查询")
    @RequestMapping(value = "action/query", method = RequestMethod.POST)
    public Result<Page<LogLoginVo>> actionLogQuery(@RequestBody @ApiParam("查询条件") @Valid LogQueryVo queryVo) {
        return Result.success(null);
    }

}
