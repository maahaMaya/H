package com.sourav.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("com/sourav/sterotype/config.xml");
		//Emp em = applicationContext.getBean("emp", Emp.class);
		Emp em = applicationContext.getBean("employee", Emp.class);
		System.out.println(em);
	}
}
