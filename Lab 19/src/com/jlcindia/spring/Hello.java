package com.jlcindia.spring;

public class Hello {

	private A aobj;
	private B bobj;
public Hello(){
	System.out.println("Hello() DC");
}
public Hello( B bobj){
	System.out.println("Hello-B() 1-arg constructor");
	this.bobj=bobj;
	}
public Hello(A aobj){
	System.out.println("Hello-A() 1-arg constructor");
	this.aobj=aobj;
}
public Hello(A aobj, B bobj) {
	super();
	this.aobj = aobj;
	this.bobj = bobj;
}
public void show(){
	System.out.println(aobj);
	System.out.println(bobj);
}
}
