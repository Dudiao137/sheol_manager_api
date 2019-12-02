package win.ots.hell.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import win.ots.hell.api.entity.Permission;

import java.util.List;
import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    List<Permission> findAllByParentId(Long parentId);

    void deleteAllByIdIn(Set ids);
}
