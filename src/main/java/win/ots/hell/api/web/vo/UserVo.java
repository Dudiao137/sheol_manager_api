package win.ots.hell.api.web.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author: sy.wang
 * @date: 2019-11-23
 */
@Data
public class UserVo {

    private String name;

    private String mobile;

    private String avatar;

    private Date createTime;
}
