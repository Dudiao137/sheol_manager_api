package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_user")
public class User extends BaseEntity {

	@Column(name = "name", columnDefinition = "varchar(126) not null comment '用户名'")
	private String name;

	@Column(name = "mobile", columnDefinition = "char(11) not null comment '手机号'")
	private String mobile;

	@Column(name = "avatar", columnDefinition = "varchar(256) comment '头像url'")
	private String avatar;

	@Column(name = "password", columnDefinition = "varchar(48) not null comment '密码，加密后'")
	private String password;

	@Column(name = "salt", columnDefinition = "varchar(48) not null comment '加密的盐'")
	private String salt;

}
