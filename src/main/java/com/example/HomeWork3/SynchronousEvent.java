package com.example.HomeWork3;

import org.springframework.context.ApplicationEvent;

public class SynchronousEvent extends ApplicationEvent {
    private Message message;

    public SynchronousEvent(Object source, Message message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message.getMessage();
    }

    public void makeLog() {
        System.out.println("Synchronous event been made");
    }
}
