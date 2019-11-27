package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: sy.wang
 * @date: 2019-11-27
 */
@Data
@Entity
@Table(name = "tbl_event_user")
public class EventUser extends BaseEntity {

    @Column(name = "event_id", columnDefinition = "bigint not null comment '事件id'")
    private Long eventId;

    @Column(name = "user_id", columnDefinition = "bigint not null comment '用户id'")
    private Long userId;
}
