package com.sourav.interface_;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext  applicationContext =  new ClassPathXmlApplicationContext("com/sourav/interface_/config.xml");
		applicationContext.registerShutdownHook();
		Student student1 = applicationContext.getBean("studentOne", Student.class);
		System.out.println(student1);
	}
}
