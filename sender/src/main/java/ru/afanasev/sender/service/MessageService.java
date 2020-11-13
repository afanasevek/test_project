package ru.afanasev.sender.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import ru.afanasev.sender.dto.MessageDto;


public interface MessageService {

    ResponseEntity<String> sendMessage(String url, HttpEntity<MessageDto> message);
}
