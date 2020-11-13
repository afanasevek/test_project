package ru.afanasev.subscriber.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.afanasev.subscriber.dto.MessageDtoRequest;
import ru.afanasev.subscriber.dto.MessageMapper;
import ru.afanasev.subscriber.model.Purchase;
import ru.afanasev.subscriber.model.PurchaseRepository;
import ru.afanasev.subscriber.model.Subscription;
import ru.afanasev.subscriber.model.SubscriptionRepository;


@Service
public class MessageServiceImpl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);
    private static final String PURCHASE = "PURCHASE";

    private final PurchaseRepository purchaseRepository;
    private final SubscriptionRepository subscriptionRepository;

    public MessageServiceImpl(PurchaseRepository purchaseRepository, SubscriptionRepository subscriptionRepository) {
        this.purchaseRepository = purchaseRepository;
        this.subscriptionRepository = subscriptionRepository;
    }

    @Override
    public void insertMessage(MessageDtoRequest request) {
        if (request.getAction().equals(PURCHASE)) {
            Purchase action = MessageMapper.convertMessageToPurchase(request);
            Purchase savedAction = purchaseRepository.save(action);
            LOGGER.info("saved success message: " + savedAction);
        } else {
            Subscription action = MessageMapper.convertMessageToSubscription(request);
            Subscription savedAction = subscriptionRepository.save(action);
            LOGGER.info("saved success message: " + savedAction);
        }
    }
}
