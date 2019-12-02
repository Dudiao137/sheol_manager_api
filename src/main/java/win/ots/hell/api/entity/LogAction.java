package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: sy.wang
 * @date: 2019-11-28
 */
@Data
@Entity
@Table(name = "tbl_log_action")
public class LogAction extends BaseEntity {

    @Column(name = "user_id", columnDefinition = "bigint not null comment '用户id'")
    private Long userId;

    @Column(name = "action", columnDefinition = "varchar(128) not null comment '操作记录'")
    private String action;

    @Column(name = "remark", columnDefinition = "varchar(128) comment '备注'")
    private String remark;
}
