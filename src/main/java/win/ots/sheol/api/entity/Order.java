package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
@Entity
@Table(name = "tbl_order")
public class Order implements Serializable {

    @Column(name = "product_id", columnDefinition = "bigint comment '商品id'")
    private Long productId;

    @Column(name = "handler_id", columnDefinition = "bigint comment '操作人id'")
    private Long handlerId;

    @Column(name = "status", columnDefinition = "int comment '订单状态'")
    private Integer status;


    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;
}
