package win.ots.hell.api.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import win.ots.hell.api.entity.Diary;

import java.util.List;

/**
 * @author : sy.wang
 * @date : 2019-11-28
 */
@Slf4j
@SpringBootTest
class DiaryRepositoryTest  {

    @Autowired
    private DiaryRepository diaryRepository;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void testAdd() {
        Diary diary = new Diary();
        diary.setUserId(137L);
        diary.setTitle("title");
        diary.setBrief("brief");
        diary.setBody("body");
        diary.setStatus(0);

        diaryRepository.save(diary);
    }

    @Test
    public void testFindAll() {
        List<Diary> diaries = diaryRepository.findAll();
        log.info("diary : {}", gson.toJson(diaries));
    }

    @Test
    void findByTitle() {
        String title = "title";
        List<Diary> diaries = diaryRepository.findByTitle(title);
        log.info("diary with title [{}] : {}", title, gson.toJson(diaries));
    }
}