package com.sourav.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("com/sourav/constructor/config.xml");
		Student student1 = applicationContext.getBean("studentOne", Student.class);
		System.out.println(student1);
	}
}
