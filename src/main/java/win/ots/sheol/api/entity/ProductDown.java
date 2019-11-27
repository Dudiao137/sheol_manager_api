package win.ots.sheol.api.entity;

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
@Table(name = "tbl_product_down")
public class ProductDown extends BaseEntity {

    @Column(name = "nick_name", columnDefinition = "varchar(128) comment '昵称'")
    private String nickName;

    @Column(name = "category_id", columnDefinition = "int not null comment '类目id'")
    private Integer categoryId;

    @Column(name = "status", columnDefinition = "int default 0 comment '状态 -1 软删除 0 正常 1 转世投胎 2 回魂'")
    private Integer status;

    @Column(name = "parent_id", columnDefinition = "bigint not null comment '上一迭代id'")
    private Long parentId;

    @Column(name = "dead_type", columnDefinition = "int default 0 comment '死亡方式 '")
    private Integer deadType;

    @Column(name = "level", columnDefinition = "int not null comment '所处层级'")
    private Integer level;

}
