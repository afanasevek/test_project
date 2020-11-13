package ru.afanasev.subscriber.dto;


public class MessageDtoRequest {

    private long msisdn;
    private String action;
    private long timestamp;

    public long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "MessageDtoRequest{" +
            "msisdn=" + msisdn +
            ", action='" + action + '\'' +
            ", timestamp=" + timestamp +
            '}';
    }
}
