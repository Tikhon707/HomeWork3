package com.example.HomeWork3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfiguration {

    @Bean
    public Message message() {
        return new Message("");
    }
}
