package win.ots.hell.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import win.ots.hell.api.entity.Role;

import java.util.Set;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    void deleteAllByIdIn(Set ids);

}
