package win.ots.sheol.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
@Entity
@Table(name = "tbl_product_record")
public class ProductRecord {

    @Id
	@Column(name = "day")
	private LocalDate day;

	@Column(name = "day_in", columnDefinition = "bigint comment '流入'")
	private Long dayIn;

	@Column(name = "day_out", columnDefinition = "bigint comment '流出'")
	private Long dayOut;

	@Column(name = "create_time", columnDefinition = "datetime default current_timestamp()")
	private Date createTime;

	@PrePersist
	public void prePersist() {
		this.createTime = new Date();
	}

}
