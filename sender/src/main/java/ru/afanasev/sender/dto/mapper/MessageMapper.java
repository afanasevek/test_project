package ru.afanasev.sender.dto.mapper;

import ru.afanasev.sender.dto.Action;
import ru.afanasev.sender.dto.MessageDto;

import java.util.Date;


public class MessageMapper {

    public static MessageDto createMessage(long msisdn, Action action) {
        MessageDto messageDto = new MessageDto();
        messageDto.setMsisdn(msisdn);
        messageDto.setAction(action);
        messageDto.setTimestamp(new Date().getTime());

        return messageDto;
    }
}
