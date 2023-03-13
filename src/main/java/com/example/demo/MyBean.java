package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("helloBean") // 수동적으로 Bean의 이름 짓기
@Component
@Scope("prototype") // prototype으로 바꾸면 요구할 때만 Bean을 생성한다
public class MyBean {

}
