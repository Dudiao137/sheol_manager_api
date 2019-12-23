package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Data
@Entity
@Table(name = "tbl_permission")
public class Permission extends BaseEntity {

    @Column(name = "name", columnDefinition = "varchar(32) not null comment '权限名称'")
    private String name;

    @Column(name = "parent_id", columnDefinition = "bigint default 0 comment '父权限id'")
    private Long parentId;
}
