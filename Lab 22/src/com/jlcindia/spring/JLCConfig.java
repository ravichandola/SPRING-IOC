package com.jlcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {

	@Bean
	public Hello hello(){
		Hello h= new Hello();
		return h;
	}
/*	@Bean
	public A createA(){
		A aobj=new A(){
			aobj.setA(88);
			aobj.setMsg("Hello Guys");
			reurn aobj;
		}*/
	
	public B createB(){
		return new B(99,"Hi Guys");
	}
	
}
