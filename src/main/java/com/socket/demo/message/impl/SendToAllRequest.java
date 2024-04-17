package com.socket.demo.message.impl;

import com.socket.demo.message.Message;
import lombok.Data;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:41
 * @Description: 发送给所有人的群聊消息的 Message
 */
@Data
public class SendToAllRequest implements Message {

    public static final String TYPE = "SEND_TO_ALL_REQUEST";

    /**
     * 消息编号
     */
    private String msgId;

    /**
     * 内容
     */
    private String content;
}
