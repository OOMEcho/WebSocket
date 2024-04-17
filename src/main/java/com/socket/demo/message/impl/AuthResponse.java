package com.socket.demo.message.impl;

import com.socket.demo.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:33
 * @Description: 用户认证响应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse implements Message {

    public static final String TYPE = "AUTH_RESPONSE";

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应提示
     */
    private String message;
}
