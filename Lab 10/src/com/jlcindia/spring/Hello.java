package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.*;

public class Hello {

	@Autowired
	@Qualifier("aobj")
	private A aobj;
	
	@Autowired
	@Qualifier("bobj")
	private B bobj;
	
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
