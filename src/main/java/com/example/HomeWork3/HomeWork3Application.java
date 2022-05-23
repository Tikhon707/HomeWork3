package com.example.HomeWork3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class HomeWork3Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext("Application event");
		var publisher = context.getBean(EventPublisher.class);
		publisher.publishSyncEvent("Synchronous event");
		publisher.publishAsyncEvent("Asynchronous event");
		publisher.publishTransactEvent();
	}

}
