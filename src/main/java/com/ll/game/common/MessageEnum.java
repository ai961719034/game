package com.ll.game.common;

/**
 * 枚举类，用来定义一些返回信息
 */
public enum MessageEnum {

    SUCCESS("200", "成功!"),
    LOGIN_SUCCESS("201", "登录成功!"),
    USERNAME_OR_PASSWORD_IS_NULL("1001", "用户名或密码不能为空!"),
    USER_NOT_FOUND("1002", "找不到此用户,登录失败!"),
    ;

    private String code;

    private String message;

    MessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
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
