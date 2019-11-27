package win.ots.sheol.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import win.ots.sheol.api.util.Result;
import win.ots.sheol.api.web.vo.DiaryCheckResult;
import win.ots.sheol.api.web.vo.DiaryVo;
import win.ots.sheol.api.web.vo.EventVo;

import javax.validation.Valid;

/**
 * @author: sy.wang
 * @date: 2019-11-27
 */
@Api("系统功能")
@RequestMapping("/v0.1")
@RestController
public class SystemController {

    @ApiOperation("新增待办")
    @RequestMapping(value = "/events/add", method = RequestMethod.POST)
    public Result<EventVo> eventAdd(@RequestBody @ApiParam("事件详情") @Valid EventVo vo) {

        return Result.success(new EventVo());
    }

    @ApiOperation("修改待办")
    @RequestMapping(value = "/events/{event_id}/edit", method = RequestMethod.PUT)
    public Result<EventVo> eventEdit(@PathVariable(value = "event_id") @ApiParam("事件id") Long eventId,
                                    @RequestBody @ApiParam("事件详情") @Valid EventVo vo) {

        return Result.success(new EventVo());
    }

    @ApiOperation("查询待办列表")
    @RequestMapping(value = "/events/users/{user_id}", method = RequestMethod.GET)
    public Result<Page<EventVo>> eventList(@PathVariable(value = "user_id") @ApiParam("用户id") Long userId,
                                          @RequestParam(value = "type") @ApiParam("查询类型 0 未发生 1 历史") Integer type) {

        return Result.success(null);
    }

    @ApiOperation("新增日记")
    @RequestMapping(value = "/diaries/add", method = RequestMethod.POST)
    public Result<DiaryVo> diaryAdd(@RequestBody @ApiParam("日记详情") @Valid DiaryVo vo) {

        return Result.success(new EventVo());
    }

    @ApiOperation("修改日记")
    @RequestMapping(value = "/diaries/{diary_id}/edit", method = RequestMethod.PUT)
    public Result<DiaryVo> diaryEdit(@PathVariable(value = "diary_id") @ApiParam("事件id") Long diaryId,
                                    @RequestBody @ApiParam("日记详情") @Valid DiaryVo vo) {

        return Result.success(new EventVo());
    }

    @ApiOperation("查询日记列表")
    @RequestMapping(value = "/diaries/users/{user_id}", method = RequestMethod.GET)
    public Result<Page<DiaryVo>> diaryList(@PathVariable(value = "user_id") @ApiParam("用户id") Long userId,
                                          @RequestParam(value = "type") @ApiParam("日记状态") Integer type) {

        return Result.success(null);
    }

    @ApiOperation("审核日记")
    @RequestMapping(value = "/diaries/{diary_id}/check", method = RequestMethod.PUT)
    public Result<DiaryCheckResult> diaryCheck(@PathVariable(value = "diary_id") @ApiParam("事件id") Long diaryId,
                                    @RequestBody @ApiParam("审核结果") @Valid DiaryCheckResult result) {

        return Result.success(new DiaryCheckResult());
    }


}
