package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: sy.wang
 * @date: 2019-11-27
 */
@Data
@Entity
@Table(name = "tbl_event")
public class Event extends BaseEntity {

    @Column(name = "user_id", columnDefinition = "bigint not null comment '创建者id'")
    private Long userId;

    @Column(name = "title", columnDefinition = "varchar(64) not null comment '事件标题'")
    private String title;

    @Column(name = "body", columnDefinition = "varchar(256) not null comment '事件内容'")
    private String body;

    @Column(name = "begin_time", columnDefinition = "datetime not null comment '事件开始时间'")
    private Date beginTime;

    @Column(name = "end_time", columnDefinition = "datetime not null comment '事件结束时间'")
    private Date endTime;

    @Column(name = "address", columnDefinition = "varchar(64) comment '事件发生地点'")
    private String address;

    @Column(name = "other", columnDefinition = "varchar(128) comment '备注'")
    private String other;
}
