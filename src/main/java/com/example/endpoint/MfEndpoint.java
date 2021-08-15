package com.example.endpoint;

import com.example.config.MesManClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import service.*;

@Endpoint
public class MfEndpoint implements MessageFacadeService{
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MesManClientConfig config;

    @Value("${rest.url}")
    private String URL;

    @Override
    public GetMessagesBySenderResponse getMessagesBySender(GetMessagesBySender parameters) {
        GetMessagesBySenderResponse response = new GetMessagesBySenderResponse();
        response.getMessage().addAll(config.createMessageManagerService().getMessagesBySender(parameters.getSender()));
        return response;
    }

    @Override
    public String addMessage(Message message) {
        return restTemplate.postForEntity(URL, message, String.class).getBody();
    }

    @Override
    public GetMessagesByDateResponse getMessagesByDate(GetMessagesByDate parameters) {
        GetMessagesByDateResponse response = new GetMessagesByDateResponse();
        response.getMessage().addAll(config.createMessageManagerService().getMessagesByDate(parameters.getSendTime()));
        return response;
    }

    @Override
    public String deleteMessage(Message message) {
        try {
            restTemplate.delete(URL + "/" +  message.getId());
            return "SUCCESS";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
