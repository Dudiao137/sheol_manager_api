package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time",
			columnDefinition = "datetime default current_timestamp() comment '创建时间'")
	private Date createTime;

	@Column(name = "update_time",
			columnDefinition = "datetime default null on update current_timestamp() comment '更新时间'")
	private Date updateTime;

	@PrePersist
	public void prePersist() {
		this.createTime = new Date();
	}

	@PreUpdate
	public void preUpdate() {
		this.updateTime = new Date();
	}

}
