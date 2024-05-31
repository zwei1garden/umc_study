package umc.study.apiPayload.code.status;

import umc.study.apiPayload.code.*;

public enum SuccessStatus implements BaseCode {
    _OK("200", "Success");

    private final ReasonDTO reason;

    SuccessStatus(String code, String message) {
        this.reason = new ReasonDTO(code, message);
    }

    @Override
    public ReasonDTO getReason() {
        return reason;
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return reason;
    }

    public String getCode() {
        return reason.getCode();
    }

    public String getMessage() {
        return reason.getMessage();
    }
}
