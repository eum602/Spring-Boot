package com.eum602.di;

import com.eum602.di.controllers.ConstructorInjectedController;
import com.eum602.di.controllers.Controller1;
import com.eum602.di.controllers.PropertyInjectedController;
import com.eum602.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		Controller1 controller1 = (Controller1) ctx.getBean("controller1");//ask the spring context to create the instance object of Controller1
		System.out.println("-------- Primary Bean");
		System.out.println(controller1.sayHello());

		System.out.println("-------- Property Injected Controller");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------Setter Injected Controller");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------Constructor Injected Controller");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
