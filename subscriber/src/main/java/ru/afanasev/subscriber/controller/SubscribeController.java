package ru.afanasev.subscriber.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.afanasev.subscriber.dto.MessageDtoRequest;
import ru.afanasev.subscriber.service.MessageService;

@RestController
@RequestMapping("/api/message")
public class SubscribeController {

    private final MessageService service;
    private static final String SUCCESS = "SUCCESS";

    public SubscribeController(MessageService service) {
        this.service = service;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(SubscribeController.class);

    @PostMapping("/subscribe")
    public String getMessage(@RequestBody MessageDtoRequest message) {
        LOGGER.info("get message: " + message);
        service.insertMessage(message);
        
        return SUCCESS;
    }
}
