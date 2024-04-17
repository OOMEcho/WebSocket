package com.socket.demo.config;

import com.socket.demo.endpoint.WebsocketServerEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author: xuesong.lei
 * @Date: 2024/4/17 22:09
 * @Description: {@link WebsocketServerEndpoint} 配置类
 */
@Configuration
public class WebSocketConfiguration {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
