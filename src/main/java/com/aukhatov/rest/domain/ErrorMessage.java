package com.aukhatov.rest.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Сообщение об ошибке")
public class ErrorMessage {
    private String message;
    private String reason;
    private ErrorCode code;

    public ErrorMessage(String message, String reason, ErrorCode code) {
        this.message = message;
        this.reason = reason;
        this.code = code;
    }

    @ApiModelProperty(value = "Сообщение", example = "Сообщение об ошибке для пользователя")
    public String getMessage() {
        return message;
    }

    @ApiModelProperty(value = "Причина ошибки", example = "Описание ошибки")
    public String getReason() {
        return reason;
    }

    @ApiModelProperty(value = "Код ошибки", example = "Код ошибки")
    public ErrorCode getCode() {
        return code;
    }
}
