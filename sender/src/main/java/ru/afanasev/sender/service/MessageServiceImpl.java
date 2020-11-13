package ru.afanasev.sender.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.afanasev.sender.dto.MessageDto;


@Service
public class MessageServiceImpl implements MessageService {

    private final RestTemplate restTemplate;

    public MessageServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<String> sendMessage(String url, HttpEntity<MessageDto> message) {
        return restTemplate.postForEntity(url, message, String.class);
    }
}
