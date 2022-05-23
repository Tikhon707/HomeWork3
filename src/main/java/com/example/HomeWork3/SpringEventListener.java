package com.example.HomeWork3;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class SpringEventListener {

    @EventListener
    public AsynchronousEvent handleSyncEvent(SynchronousEvent event){
        System.out.println(event.getMessage());
        System.out.println("Synchronous event processed");
        return new AsynchronousEvent(event.getSource());
    }

    @EventListener
    @Async
    public void handleAsyncEvent(AsynchronousEvent event) {
        System.out.println("Asynchronous status: " + event.getStatus());
        System.out.println("Asynchronous event processed");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void handleTransactEvent(TransactionEvent transactionEvent) {
        try {
            transactionEvent.makeTransaction();
            System.out.println("Transactional event processed");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

