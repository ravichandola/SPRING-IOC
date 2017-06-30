package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab7 {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("jlcindia.xml");
		Customer cust=(Customer)ctx.getBean("cust");
		cust.show();
	}
}
