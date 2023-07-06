package com.sourav.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("com/sourav/collection/config.xml");
		Student student1 = applicationContext.getBean("studentOne", Student.class);
		//Student student2 = applicationContext.getBean("studentTwo", Student.class);
		System.out.println(student1);
		//System.out.println(student2);
	}
}
