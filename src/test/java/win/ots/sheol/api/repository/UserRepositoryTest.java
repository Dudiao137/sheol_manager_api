package win.ots.sheol.api.repository;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@SpringBootTest
class UserRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Gson gson;

    @Test
    public void addTest() {

        User user = new User();
        user.setName("a");
        user.setPassword("b");
        user.setSalt("c");
        user.setMobile("12345678901");
        user = userRepository.save(user);

        log.info("after create, user : {}", gson.toJson(user));

        List<User> users = userRepository.findAll();
        log.info("all users : {}", gson.toJson(users));

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        user.setName("aa");
        user = userRepository.save(user);
        // 在同一个事物中，不会触发更新操作

        log.info("after update, user : {}", gson.toJson(user));
    }
}