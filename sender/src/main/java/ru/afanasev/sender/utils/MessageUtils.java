package ru.afanasev.sender.utils;

import ru.afanasev.sender.dto.Action;


public class MessageUtils {

    public static long generateMsisdn() {
        return (long) (Math.random() * 100000000);
    }

    public static Action generateAction() {
        int number = (int) Math.round(Math.random());
        if (number != 1) {
            return Action.PURCHASE;
        } else {
            return Action.SUBSCRIPTION;
        }
    }
}
