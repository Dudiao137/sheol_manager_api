package win.ots.hell.api.entity;

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
@Table(name = "tbl_order")
public class Order extends BaseEntity {

    @Column(name = "product_id", columnDefinition = "bigint not null comment '商品id'")
    private Long productId;

    @Column(name = "handler_id", columnDefinition = "bigint not null comment '操作人id'")
    private Long handlerId;

    @Column(name = "status", columnDefinition = "int default 0 comment '订单状态'")
    private Integer status;

}
