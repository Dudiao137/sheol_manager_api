package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_equipment")
public class Equipment implements Serializable {

	@Column(name = "name", columnDefinition = "varchar(36) comment '设备名称'")
	private String name;

	@Column(name = "image", columnDefinition = "varchar(256) comment '设备图像地址'")
	private String image;

	@Column(name = "status", columnDefinition = "int comment '设备状态'")
	private Integer status;

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

}
