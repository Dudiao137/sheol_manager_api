package win.ots.hell.api.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author : sy.wang
 * @date : 2019-11-28
 */
@Data
@Document(collection = "diary")
public class Diary implements Serializable {
    @Id
    private String id;

    @Field(name = "user_id")
    private Long userId;

    @Field(name = "title")
    private String title;

    @Field(name = "brief")
    private String brief;

    @Field(name = "body")
    private String body;

    @Field(name = "status")
    private Integer status;
}
