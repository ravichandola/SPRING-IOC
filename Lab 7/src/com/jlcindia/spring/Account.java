package com.jlcindia.spring;

public class Account {

	private int accno;
	private String atype;
	private double bal;
	
	private Account(){
		System.out.println("Account-DC");
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bal=" + bal + "]";
	}
	
}
