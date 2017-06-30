package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;

@Configuration
public class JlcConfig {
	
	@Bean(name="ao1")
	public A createA(){
		A aobj =new A();
		aobj.setA(10);
		aobj.setMsg("Ravi");
		return aobj;
	}

	@Bean(name="ao2")
	public A createA2(){
		A aobj =new A();
		aobj.setA(10);
		aobj.setMsg("Ravi");
		return aobj;
	}

	@Bean
	public B createB(){
		B bobj= new B(20,"BBB");
		return bobj;
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public Hello hello(){
		return new Hello();
	}
	
}
