package win.ots.sheol.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import win.ots.sheol.api.entity.User;

/**
 * @author : sy.wang
 * @date : 2019-11-22
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
