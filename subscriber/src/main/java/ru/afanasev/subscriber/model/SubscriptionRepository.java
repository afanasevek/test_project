package ru.afanasev.subscriber.model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
