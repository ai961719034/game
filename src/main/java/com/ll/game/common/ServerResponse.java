package com.ll.game.common;

/**
 * 响应类，返回一些信息加数据
 */
public class ServerResponse {

    // 标志码
    private String code;

    // 信息
    private String message;

    // 数据
    private Object data;

    /**
     * 构造方法，用来返回不带数据的信息
     * @param code 返回码
     * @param message 返回信息
     */
    public ServerResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 构造方法，用来返回带数据的信息
     * @param code 返回码
     * @param message 返回信息
     * @param data 返回数据
     */
    public ServerResponse(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 单独返回信息，不附带数据
     * @param messageEnum 枚举类
     * @return 交易信息
     */
    public static ServerResponse singleMessage(MessageEnum messageEnum) {
        return new ServerResponse(messageEnum.getCode(), messageEnum.getMessage());
    }

    /**
     * 返回信息加数据
     * @param data 数据
     * @return 返回信息加数据
     */
    public static ServerResponse getServerResponseData(Object data) {
        return new ServerResponse(MessageEnum.SUCCESS.getCode(), MessageEnum.SUCCESS.getMessage(), data);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
