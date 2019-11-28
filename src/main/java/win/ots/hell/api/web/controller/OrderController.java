package win.ots.hell.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import win.ots.hell.api.util.Result;
import win.ots.hell.api.web.vo.OrderQueryVo;
import win.ots.hell.api.web.vo.OrderVo;

import javax.validation.Valid;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Api("商品管理")
@RestController
@RequestMapping("/v0.1/orders")
public class OrderController {

    @ApiOperation("分页查询列表")
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public Result<Page<OrderVo>> query(@RequestBody @Valid OrderQueryVo queryVo) {
        return Result.success(null);
    }

    @ApiOperation("新增")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result<OrderVo> add(@RequestBody @Valid OrderVo orderVo) {
        return Result.success(null);
    }

    @ApiOperation("编辑")
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public Result<OrderVo> edit(@RequestBody @Valid OrderVo orderVo) {
        return Result.success(null);
    }

}
