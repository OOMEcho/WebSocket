package com.socket.demo.handler.impl;

import com.socket.demo.handler.MessageHandler;
import com.socket.demo.message.impl.AuthRequest;
import com.socket.demo.message.impl.AuthResponse;
import com.socket.demo.message.impl.UserJoinNoticeRequest;
import com.socket.demo.util.WebSocketUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.websocket.Session;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:46
 * @Description: 处理 AuthRequest 消息
 */
@Component
public class AuthMessageHandler implements MessageHandler<AuthRequest> {

    @Override
    public void execute(Session session, AuthRequest message) {
        // 如果未传递 accessToken
        if (StringUtils.isEmpty(message.getAccessToken())) {
            AuthResponse authResponse = new AuthResponse();
            authResponse.setCode(1);
            authResponse.setMessage("认证 accessToken 未传入");
            WebSocketUtil.send(session, AuthResponse.TYPE, authResponse);
            return;
        }

        // 添加到 WebSocketUtil 中
        WebSocketUtil.addSession(session, message.getAccessToken()); // 考虑到代码简化，我们先直接使用 accessToken 作为 User

        // 判断是否认证成功。这里，假装直接成功
        AuthResponse authResponse = new AuthResponse();
        authResponse.setCode(0);
        WebSocketUtil.send(session, AuthResponse.TYPE, authResponse);

        // 通知所有人，某个人加入了。这个是可选逻辑，仅仅是为了演示
        UserJoinNoticeRequest userJoinNoticeRequest = new UserJoinNoticeRequest();
        userJoinNoticeRequest.setNickname(message.getAccessToken());
        WebSocketUtil.broadcast(UserJoinNoticeRequest.TYPE, userJoinNoticeRequest); // 考虑到代码简化，我们先直接使用 accessToken 作为 User
    }

    @Override
    public String getType() {
        return AuthRequest.TYPE;
    }
}
