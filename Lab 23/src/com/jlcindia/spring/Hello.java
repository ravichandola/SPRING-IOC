package com.jlcindia.spring;

public class Hello {

	private A aobj;

	public void setAobj(A aobj) {
		System.out.println("Hello- Set Aobj");
		this.aobj = aobj;
	}
	
	public void show(){
		System.out.println(aobj);
	}
}
