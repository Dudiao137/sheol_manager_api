package win.ots.sheol.api.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import win.ots.sheol.api.entity.User;

import java.util.Date;
import java.util.List;

/**
 * @author : sy.wang
 * @date : 2019-11-22
 */
@SpringBootTest
class UserRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void addTest() {
        User user = new User();
        user.setName("a");
        user.setPassword("b");
        user.setSalt("c");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user = userRepository.save(user);
        System.out.println(user);

        List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}