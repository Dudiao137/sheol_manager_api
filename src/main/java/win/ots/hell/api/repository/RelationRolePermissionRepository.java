package win.ots.hell.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import win.ots.hell.api.entity.RelationRolePermission;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface RelationRolePermissionRepository extends JpaRepository<RelationRolePermission, Long> {
}
