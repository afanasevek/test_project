package ru.afanasev.subscriber.service;

import org.springframework.transaction.annotation.Transactional;
import ru.afanasev.subscriber.dto.MessageDtoRequest;


public interface MessageService {
    @Transactional
    void insertMessage(MessageDtoRequest request);
}
