package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_user")
public class User implements Serializable {

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false,
            columnDefinition = "varchar(126) comment '用户名'")
	private String name;

	@Column(name = "mobile", nullable = false,
            columnDefinition = "char(11) comment '手机号'")
	private String mobile;

	@Column(name = "avatar",
            columnDefinition = "varchar(256) comment '头像url'")
	private String avatar;

	@Column(name = "password", nullable = false,
            columnDefinition = "varchar(48) comment '密码，加密后'")
	private String password;

	@Column(name = "salt", nullable = false,
            columnDefinition = "varchar(48) comment '加密的盐'")
	private String salt;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

}
