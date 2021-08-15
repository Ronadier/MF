package com.example.config;

import lombok.var;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Value("${rest.connection-timeout}")
    private int connectTimeout;

    @Value("${rest.read-timeout}")
    private int readTimeout;

    @Bean
    public RestTemplate restTemplate() {
        var factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(connectTimeout);
        factory.setReadTimeout(readTimeout);
        return new RestTemplate(factory);
    }
}
