package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author : sy.wang
 * @date : 2019-11-26
 */
@Data
@Entity
@Table(name = "tbl_category")
public class Category extends BaseEntity {

    @Column(name = "name", columnDefinition = "varchar(32) not null comment '类目名称'")
    private String name;

    @Column(name = "parent_id", columnDefinition = "int default 0 not null comment '父级id'")
    private Integer parentId;
}
