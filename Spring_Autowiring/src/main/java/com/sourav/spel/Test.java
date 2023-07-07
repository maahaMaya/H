package com.sourav.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("com/sourav/spel/config.xml");
		Student student1 = applicationContext.getBean("student", Student.class);

		System.out.println(student1);	
		System.out.println(student1.callMethod);
		
		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		org.springframework.expression.Expression ex = spelExpressionParser.parseExpression("'Hello World'");
		System.out.println(ex.getValue());
	}
}
