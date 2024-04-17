package com.socket.demo.message.impl;

import com.socket.demo.message.Message;
import lombok.Data;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:40
 * @Description: 发送给指定人的私聊消息的 Message
 */
@Data
public class SendToOneRequest implements Message {

    public static final String TYPE = "SEND_TO_ONE_REQUEST";

    /**
     * 发送给的用户
     */
    private String toUser;

    /**
     * 消息编号
     */
    private String msgId;

    /**
     * 内容
     */
    private String content;
}
