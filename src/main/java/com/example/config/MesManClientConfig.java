package com.example.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.MessageManagerService;

@Configuration
public class MesManClientConfig {

    private JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();

    @Value("${soap.url}")
    private String url;

    @Bean
    @RefreshScope
    public MessageManagerService createMessageManagerService() {
        bean.setAddress(url);
        bean.setServiceClass(MessageManagerService.class);
        return bean.create(MessageManagerService.class);
    }
}
