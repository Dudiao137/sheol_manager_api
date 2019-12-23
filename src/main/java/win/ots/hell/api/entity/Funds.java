package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author : sy.wang
 * @date : 2019-11-27
 */
@Data
@Entity
@Table(name = "tbl_funds")
public class Funds extends BaseEntity {

    @Column(name = "user_id", columnDefinition = "bigint not null comment '用户id'")
    private Long userId;

    @Column(name = "amount", columnDefinition = "bigint not null comment '金额，精度 分'")
    private Long amount;
}
