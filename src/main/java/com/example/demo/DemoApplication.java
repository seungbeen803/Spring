package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo", "hello"}) // 오버라이드
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getClass().getName());
		String[] beanNames = context.getBeanDefinitionNames();
		// 확인해보기
		for (String beanName : beanNames) {
			if (!beanName.startsWith("org.") && !beanName.startsWith("spring.")) {
				System.out.println(beanName);
			}
		}
		// Ioc컨테이너에서 Bean을 꺼내는 작업
		// 1. 이름으로 꺼내는 작업
		MyBean myBean = (MyBean) context.getBean("myBean");
//		Person person = (Person) context.getBean("person");
		MyBean myBean1 = (MyBean) context.getBean("myBean");
		MyBean myBean2 = (MyBean) context.getBean("myBean");
		System.out.println(myBean1 == myBean2); // myBean1과 myBean2는 다른 객체가 아니라 주소가 같은 완전히 똑같은 객체이다.

		var person = (Person) context.getBean("helloMyPerson");

		
		// 2. 클래스로 꺼내는 작업
//		Person person = (Person) context.getBean(Person.class);
		System.out.println(person);

		var calculatorService = (MyCalculatorService) context.getBean(MyCalculatorService.class);
		calculatorService.calcAdd(5, 3);

		GreetingService greetingService = (GreetingService) context.getBean(GreetingService.class);
		greetingService.greet();
	}

}
