package com.socket.demo.message.impl;

import com.socket.demo.message.Message;
import lombok.Data;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:42
 * @Description: 发送消息响应结果的 Message
 */
@Data
public class SendResponse implements Message {

    public static final String TYPE = "SEND_RESPONSE";

    /**
     * 消息编号
     */
    private String msgId;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应提示
     */
    private String message;
}
