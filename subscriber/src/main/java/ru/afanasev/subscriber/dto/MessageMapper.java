package ru.afanasev.subscriber.dto;

import ru.afanasev.subscriber.model.Purchase;
import ru.afanasev.subscriber.model.Subscription;


public class MessageMapper {

    public static Purchase convertMessageToPurchase(MessageDtoRequest messageDtoRequest) {
        Purchase action = new Purchase();
        action.setMsisdn(messageDtoRequest.getMsisdn());
        action.setTimestamp(messageDtoRequest.getTimestamp());

        return action;
    }

    public static Subscription convertMessageToSubscription(MessageDtoRequest messageDtoRequest) {
        Subscription action = new Subscription();
        action.setMsisdn(messageDtoRequest.getMsisdn());
        action.setTimestamp(messageDtoRequest.getTimestamp());

        return action;
    }
}
