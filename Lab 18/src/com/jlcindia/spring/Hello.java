package com.jlcindia.spring;

public class Hello {

	private A aobj;
	private B bobj;
public Hello(){
	System.out.println("Hello() DC");
}
public Hello(A aobj, B bobj) {

	this.aobj = aobj;
	this.bobj = bobj;
}
public void show(){
	System.out.println(aobj);
	System.out.println(bobj);
}
}
