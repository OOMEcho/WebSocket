package com.socket.demo.message.impl;

import com.socket.demo.message.Message;
import lombok.Data;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:25
 * @Description: 用户认证请求
 */
@Data
public class AuthRequest implements Message {

    public static final String TYPE = "AUTH_REQUEST";

    /**
     * 认证 Token
     */
    private String accessToken;
}
