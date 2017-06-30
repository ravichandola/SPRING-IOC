package com.jlcindia.spring;

import org.springframework.beans.factory.annotation.*;

public class Hello {

	@Autowired(required=false)
	private A aobj;
	
	@Autowired(required=false)
	private B bobj;
	
	
	public void show(){
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
