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
@Table(name = "tbl_log_login")
public class LogLogin extends BaseEntity {

    @Column(name = "user_id", columnDefinition = "bigint not null comment '用户id'")
    private Long userId;

    @Column(name = "ip", columnDefinition = "varchar(64) not null comment '登录ip'")
    private String ip;

    @Column(name = "device", columnDefinition = "varchar(64) not null comment '登录设备'")
    private String device;
}
