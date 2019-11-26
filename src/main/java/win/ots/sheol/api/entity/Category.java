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
@Table(name = "tbl_category")
public class Category implements Serializable {

    @Column(name = "name", columnDefinition = "varchar(32) comment '类目名称'")
    private String name;

    @Column(name = "parent_id", columnDefinition = "int comment '父级id'")
    private Integer parentId;

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;
}
