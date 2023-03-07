package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyCalculatorService {
    // 해당 필드(calculator)에 의존성 주입이 진행될 수 있도록 Autowired 어노테이션을 적용
    //@Autowired // 필드 앞에 작성
    private Calculator calculator;

    // 필드 주입
//    @Autowired // 생성자에다 @Autowired 작성해야함
//    public MyCalculatorService(Calculator calculator) {
//        this.calculator = calculator;
//    }

    // 세터 주입
    @Autowired
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    public int calcAdd(int a, int b) {
        return calculator.add(a, b);
    }

    @Autowired
    public void iNeedDependency(MyBean myBean, @Qualifier("helloMyPerson") Person p , Calculator c) {
        System.out.println(myBean);
        System.out.println(c);
    }
}
