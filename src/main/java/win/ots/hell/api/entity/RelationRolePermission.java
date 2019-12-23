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
@Table(name = "tbl_role_permission")
public class RelationRolePermission extends BaseEntity {

    @Column(name = "role_id", columnDefinition = "bigint not null comment '角色id'")
    private Long roleId;

    @Column(name = "permission_id", columnDefinition = "bigint not null comment '权限id'")
    private Long permissionId;

}
