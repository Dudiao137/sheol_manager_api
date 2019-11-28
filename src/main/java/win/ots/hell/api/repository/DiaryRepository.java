package win.ots.hell.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import win.ots.hell.api.entity.Diary;

import java.util.List;

/**
 * @author : sy.wang
 * @date : 2019-11-28
 */
public interface DiaryRepository extends MongoRepository<Diary, String> {

    List<Diary> findByTitle(String title);
}
