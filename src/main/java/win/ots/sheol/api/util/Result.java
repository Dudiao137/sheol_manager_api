package win.ots.sheol.api.util;

import lombok.Data;

/**
 * @author : sy.wang
 * @date : 2019-11-22
 */
@Data
public class Result<T> {
    int code = -1;           // default -1 error
    String message;
    T data;
}
