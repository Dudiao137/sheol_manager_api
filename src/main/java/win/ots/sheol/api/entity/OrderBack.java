package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
@Entity
@Table(name = "tbl_order_back")
public class OrderBack extends BaseEntity {

    @Column(name = "order_id", columnDefinition = "bigint not null comment '订单id'")
    private Long orderId;

    @Column(name = "reason", columnDefinition = "varchar(256) comment '退单原因'")
    private String reason;

    @Column(name = "status", columnDefinition = "int default 0 comment '状态'")
    private Integer status;

}
