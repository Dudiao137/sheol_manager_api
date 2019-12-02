package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
@Data
@Entity
@Table(name = "tbl_role",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"code"}, name = "unique_code"),
                @UniqueConstraint(columnNames = {"name"}, name = "unique_name")})
public class Role extends BaseEntity {

    @Column(name = "name", columnDefinition = "varchar(32) not null comment '角色名称'")
    private String name;

    @Column(name = "code", columnDefinition = "varchar(32) not null comment '角色标识'")
    private String code;
}
