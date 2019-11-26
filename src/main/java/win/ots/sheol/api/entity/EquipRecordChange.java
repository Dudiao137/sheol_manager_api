package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "tbl_equip_record_change")
public class EquipRecordChange implements Serializable {

	@Column(name = "equip_id", columnDefinition = "bigint comment '设备id'")
	private Long equipId;

	@Column(name = "handler_id", columnDefinition = "bigint comment '修改者id'")
	private Long handlerId;

	@Column(name = "record", columnDefinition = "bigint comment '修改内容'")
	private String record;

    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name = "create_time")
	private Date createTime;

	@Column(name = "update_time")
	private Date updateTime;

}
