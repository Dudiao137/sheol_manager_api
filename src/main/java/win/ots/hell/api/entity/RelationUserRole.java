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
@Table(name = "tbl_user_role")
public class RelationUserRole extends BaseEntity {

    @Column(name = "user_id", columnDefinition = "bigint not null comment '用户id'")
    private Long userId;

    @Column(name = "role_id", columnDefinition = "bigint not null comment '角色id'")
    private Long roleId;
}
