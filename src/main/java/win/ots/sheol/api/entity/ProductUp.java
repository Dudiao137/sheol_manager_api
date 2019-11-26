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
@Table(name = "tbl_product_up")
public class ProductUp implements Serializable {

    @Column(name = "nick_name", columnDefinition = "varchar(128) comment '昵称'")
    private String nickName;

    @Column(name = "category_id", columnDefinition = "int comment '类目id'")
    private Integer categoryId;

    @Column(name = "status", columnDefinition = "int comment '状态 -1 软删除 0 生 1 死'")
    private Integer status;

    @Column(name = "parent_id", columnDefinition = "bigint comment '上一迭代id'")
    private Long parentId;

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;



}
