package com.sourav.javconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(Config.class); 
		Emp em = applicationContext.getBean("getEmp", Emp.class);

		System.out.println(em);		
	}
}
