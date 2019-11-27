package win.ots.sheol.api.entity;

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
@Table(name = "tbl_funds_transfer")
public class FundsTransfer extends BaseEntity {

    @Column(name = "receiver_id", columnDefinition = "bigint not null comment '收款人'")
    private Long receiverId;

    @Column(name = "payer_id", columnDefinition = "bigint not null comment '汇款人'")
    private Long payerId;

    @Column(name = "amount", columnDefinition = "bigint not null comment '金额，精度为分'")
    private Long amount;

    @Column(name = "remark", columnDefinition = "varchar(256) comment '备注'")
    private String remark;

    @Column(name = "address", columnDefinition = "varchar(128) comment '发生地点'")
    private String address;

}
