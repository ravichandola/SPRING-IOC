package com.jlcindia.spring;

public class B extends A{

	private int b;
	private String str;
	public B(int b, String str) {
		
		this.b = b;
		this.str = str;
	}
	public String toString(){
		return""+b+"\t"+str;
	}
}
