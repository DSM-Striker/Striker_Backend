package org.example.common.exception;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum GeneralExceptionCode implements GlobalErrorCode {
    BAD_REQUEST(400, "요청이 잘못되었습니다"),
    INTERNAL_SERVER_ERROR(500, "서버에 문제가 발생했습니다");

    private final int errorCode;
    private final String errorMessage;

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
