package com.jlcindia.spring;

public class Address {

	private String city;
	private String street;
	private String state;
	public Address(String city, String street, String state) {
		System.out.println("3-Arg Constructor");
		this.city = city;
		this.street = street;
		this.state = state;
	}
	@Override
	public String toString() {
		return ""+city+"\t"+street+"\t"+state;
	}
	
}
