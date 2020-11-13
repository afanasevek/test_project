package ru.afanasev.sender.controller;

import org.apache.logging.log4j.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.afanasev.sender.dto.Action;
import ru.afanasev.sender.dto.MessageDto;
import ru.afanasev.sender.dto.mapper.MessageMapper;
import ru.afanasev.sender.service.MessageService;
import ru.afanasev.sender.utils.MessageUtils;

import static ru.afanasev.sender.dto.mapper.MessageMapper.*;
import static ru.afanasev.sender.utils.MessageUtils.*;


@RestController
@RequestMapping("/api/message")
public class SendController {

    private final MessageService messageService;

    public SendController(MessageService messageService) {
        this.messageService = messageService;
    }

    private static final String SUBSCRIBE = "http://localhost:8080/api/message";
    private static final Logger LOGGER = LoggerFactory.getLogger(SendController.class);
    private static final String SUCCESS = "success";

    @GetMapping("/send")
    public String sendMessage() {
        long msisdn = generateMsisdn();
        Action action = generateAction();
        MessageDto message = createMessage(msisdn, action);
        LOGGER.info("send message: " + message);
        HttpEntity<MessageDto> requestBody = new HttpEntity<>(message);
        ResponseEntity<String> result = messageService.sendMessage(SUBSCRIBE + "/subscribe", requestBody);

        return result.getBody();
    }
}
