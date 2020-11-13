package ru.afanasev.subscriber.model;

import javax.persistence.*;

@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long msisdn;
    private long timestamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Subscription{" +
            "id=" + id +
            ", msisdn=" + msisdn +
            ", timestamp=" + timestamp +
            '}';
    }
}
