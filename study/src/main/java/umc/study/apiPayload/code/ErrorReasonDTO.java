package umc.study.apiPayload.code;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ErrorReasonDTO {
    private final String message;
    private final String code;
    private final boolean isSuccess;
    private HttpStatus httpStatus; // Optional, only for methods that require HTTP status

    public ErrorReasonDTO(String message, String code, boolean isSuccess, HttpStatus httpStatus) {
        this.message = message;
        this.code = code;
        this.isSuccess = isSuccess;
        this.httpStatus = httpStatus;
    }

    // Builder method for the case without HTTP status
    public ErrorReasonDTO(String message, String code, boolean isSuccess) {
        this(message, code, isSuccess, null);
    }
}
