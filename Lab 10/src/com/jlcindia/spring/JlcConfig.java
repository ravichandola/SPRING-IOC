package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

@Configuration
public class JlcConfig {
	
	@Bean
	public A aobj(){
		A aobj =new A();
		aobj.setA(10);
		aobj.setMsg("Ravi");
		return aobj;
	}
	
	@Bean
	public B bobj(){
		return new B(20,"Chandola");
	}
	@Bean(autowire=Autowire.BY_NAME)
	public Hello hello(){
		return new Hello();
	}
	
}
