package com.eum602.di;

import com.eum602.di.controllers.Controller1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		Controller1 controller1 = (Controller1) ctx.getBean("controller1");//ask the spring context to create the instance object of Controller1
		String greeting = controller1.sayHello();

		System.out.println(greeting);
	}

}