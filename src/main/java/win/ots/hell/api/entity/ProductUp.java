package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
@Entity
@Table(name = "tbl_product_up")
public class ProductUp extends BaseEntity {

    @Column(name = "nick_name", columnDefinition = "varchar(128) comment '昵称'")
    private String nickName;

    @Column(name = "category_id", columnDefinition = "int not null comment '类目id'")
    private Integer categoryId;

    @Column(name = "dead_time", columnDefinition = "datetime not null comment '终止日期'")
    private Date deadTime;

    @Column(name = "status", columnDefinition = "int default 0 comment '状态 -1 软删除 0 正常'")
    private Integer status;

    @Column(name = "parent_id", columnDefinition = "bigint not null comment '上一迭代id'")
    private Long parentId;

}
