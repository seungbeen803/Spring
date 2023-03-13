package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:myconfig.properties")
public class GreetingService {
    @Value("${myconfig.some.value}")
    private String message;

    public void greet() {
        System.out.println(message);
    }
}
