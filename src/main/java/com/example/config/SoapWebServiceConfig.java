package com.example.config;

import com.example.endpoint.MfEndpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import javax.xml.ws.Endpoint;

@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean<CXFServlet> dispatcherservlet() {
        return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/ws/*");
    }

    @Bean
    @Primary
    public DispatcherServletPath dispatcherServletPathProvider() {
        return () -> "";
    }

    @Bean
    public Endpoint endpoint(Bus bus, MfEndpoint mfEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(bus, mfEndpoint);
        endpoint.publish("/facadeBeanService");
        return endpoint;
    }
}
