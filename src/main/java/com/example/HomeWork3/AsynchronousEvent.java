package com.example.HomeWork3;

import org.springframework.context.ApplicationEvent;

public class AsynchronousEvent extends ApplicationEvent {
    public AsynchronousEvent(Object source) {
        super(source);
    }

    private void makeLog() {
        System.out.println("Asynchronous event been made");
    }

    public String getStatus() {
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "All good";
    }
}
