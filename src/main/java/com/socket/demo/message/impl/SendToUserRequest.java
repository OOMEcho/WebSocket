package com.socket.demo.message.impl;

import com.socket.demo.message.Message;
import lombok.Data;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:43
 * @Description: 发送消息给一个用户的 Message
 */
@Data
public class SendToUserRequest implements Message {

    public static final String TYPE = "SEND_TO_USER_REQUEST";

    /**
     * 消息编号
     */
    private String msgId;

    /**
     * 内容
     */
    private String content;
}
