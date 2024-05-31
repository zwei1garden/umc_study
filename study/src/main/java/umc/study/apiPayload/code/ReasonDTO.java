package umc.study.apiPayload.code;

import lombok.Getter;

@Getter
public class ReasonDTO {

    private String code;
    private String message;


    public ReasonDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
