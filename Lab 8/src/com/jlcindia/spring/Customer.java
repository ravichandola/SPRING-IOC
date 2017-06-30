package com.jlcindia.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.*;

public class Customer {

	private int cid;
	private String cname;
	private String email;
	private long phone;

	@Resource(name="emails")
	private List<String> emails;
	
	@Resource(name="phones")
	private Set<Long> phones;
	
	@Resource(name="refs")
	private Map<String,Long> refs;
	
	@Resource(name="myprops")
	private Properties myprops;
	
	@Resource(name="address")
	private Address address;
	
	@Resource(name="accounts")
	private List<Account> acccounts;
	
	
	public Customer(int cid, String cname, String email, long phone) {
	System.out.println("4- arg Constructor");
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}
		
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	public Properties getMyprops() {
		return myprops;
	}

	public void setMyprops(Properties myprops) {
		this.myprops = myprops;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Account> getAcccounts() {
		return acccounts;
	}

	public void setAcccounts(List<Account> acccounts) {
		this.acccounts = acccounts;
	}

	public void show(){
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(emails);
		System.out.println(phones);
		System.out.println(refs);
		System.out.println(myprops);
		System.out.println(address);
		
		for(Account acc: acccounts){
			System.out.println(acc);
		}
		System.out.println(emails.getClass().getName());
		System.out.println(refs.getClass().getName());
		System.out.println(phones.getClass().getName());
		System.out.println(myprops.getClass().getName());
	
	}
	
}
