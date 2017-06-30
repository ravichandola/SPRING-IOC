package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab9 {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(JlcConfig.class);
		Hello hello=(Hello)ctx.getBean("hello");
		hello.show();
	}
}
