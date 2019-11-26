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
@Table(name = "tbl_order_back")
public class OrderBack implements Serializable {

    @Column(name = "order_id", columnDefinition = "bigint comment '订单id'")
    private Long orderId;

    @Column(name = "reason", columnDefinition = "varchar(256) comment '退单原因'")
    private String reason;

    @Column(name = "status", columnDefinition = "int comment '状态'")
    private Integer status;

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

}
