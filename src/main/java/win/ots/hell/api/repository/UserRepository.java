package win.ots.hell.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import win.ots.hell.api.entity.User;

/**
 * @author : sy.wang
 * @date : 2019-11-22
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
