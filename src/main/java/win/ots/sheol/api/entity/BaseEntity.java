package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

}
