package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_equipment")
public class Equipment extends BaseEntity {

	@Column(name = "name", columnDefinition = "varchar(36) not null comment '设备名称'")
	private String name;

	@Column(name = "image", columnDefinition = "varchar(256) not null comment '设备图像地址'")
	private String image;

	@Column(name = "status", columnDefinition = "int default 0 comment '设备状态'")
	private Integer status;
}
