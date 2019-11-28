package win.ots.hell.api.util;

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

    private Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> Result success(T t) {
        return new Result(0, null, t);
    }

    public static <T> Result error(String message) {
        return new Result(-1, message, null);
    }

    public static <T> Result error(int code, String message) {
        return new Result(code, message, null);
    }


}
