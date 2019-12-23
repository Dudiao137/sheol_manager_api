package win.ots.hell.api.util;

import org.springframework.http.HttpStatus;

/**
 * @author : sy.wang
 * @date : 2019-12-02
 */
public class BusinessException extends RuntimeException {
    String message;

    int code;

    public BusinessException(HttpStatus status, String message) {
        this.message = message;
        this.code = status.value();
    }

    public BusinessException(String message) {
        this.message = message;
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    public BusinessException(String format, Object... args) {
        this.message = String.format(format, args);
        this.code = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

}
