package com.sourav.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext  applicationContext =  new ClassPathXmlApplicationContext("com/sourav/xml/config.xml");
		applicationContext.registerShutdownHook();
		Student student1 = applicationContext.getBean("studentOne", Student.class);
		System.out.println(student1);
	}
}
