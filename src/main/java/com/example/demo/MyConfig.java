package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean // Component 역할을 함
    public MyBean helloMyBean() {
        return new MyBean();
    }

    @Bean
    public Person helloMyPerson() {
        Person p = new Person("John", 20); // 메서드에서 리턴
        p.setSomething("something"); // setter처럼 호출할 수 있음
        return p;
    }
}
