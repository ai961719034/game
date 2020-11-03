package com.ll.game.common;

public enum MessageEnum {

    LOGIN_SUCCESS("200", "登录成功!"),
    ;

    private String code;

    private String message;

    MessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageEnum{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
