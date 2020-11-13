package ru.afanasev.sender.dto;


public class MessageDto {

    private long msisdn;
    private Action action;
    private long timestamp;

    public long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
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
        return "MessageDto{" +
            "msisdn=" + msisdn +
            ", action=" + action +
            ", timestamp=" + timestamp +
            '}';
    }
}
