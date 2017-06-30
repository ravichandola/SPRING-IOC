package com.jlcindia.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Lab8 {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(JLCConfig.class);
		Customer cust=(Customer)ctx.getBean("cust");
		cust.show();
	}
}
