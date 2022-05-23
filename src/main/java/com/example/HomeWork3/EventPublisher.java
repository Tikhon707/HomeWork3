package com.example.HomeWork3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher {
    public ApplicationEventPublisher applicationEventPublisher;

    public EventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishSyncEvent(String message) {
        applicationEventPublisher.publishEvent(new SynchronousEvent(this, new Message(message)));
    }

    public void publishAsyncEvent(String message) {
        applicationEventPublisher.publishEvent(new AsynchronousEvent(this));
    }

    public void publishTransactEvent() {
        applicationEventPublisher.publishEvent(new TransactionEvent(this));
    }
}
