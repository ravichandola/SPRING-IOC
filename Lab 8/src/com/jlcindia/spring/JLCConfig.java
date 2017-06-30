package com.jlcindia.spring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
public class JLCConfig {

	@Bean
	public List<String> emails(){
		List<String> emails= new ArrayList<String>();
		emails.add("ravi@jlc");
		emails.add("rc@1223");
		emails.add("rki@123");
		return emails;
	}
	@Bean
	public Set <Long> phones(){
		Set<Long> phones= new LinkedHashSet<Long>();
		phones.add(1111L);
		phones.add(1122L);
		phones.add(331L);
		return phones;
	}
	
	@Bean(name="refs")
	public Map<String,Integer> refrences(){
		Map <String,Integer> refs= new LinkedHashMap<String,Integer>();
		refs.put("AA",11);
		refs.put("BB",211);
		refs.put("CC",110);
		return refs;
	}
	
	@Bean(name="myprops")
	public Properties myPropoerties(){
		Properties prop =new Properties();
		prop.put("AA", 11);
		prop.put("BB", 22);
		prop.put("CC", 33);
		return prop;
	}
	
	@Bean()
	public Address address(){
		return new Address("Bangalore","BTM","MHA");
	}
	
	@Bean()
	public Account account1(){
		Account acc1= new Account();
		acc1.setAccno(11);
		acc1.setAtype("SA");
		acc1.setBal(10000);
		return acc1;
		
	}
	
	@Bean()
	public Account account2(){
		Account acc2= new Account();
		acc2.setAccno(101);
		acc2.setAtype("CA");
		acc2.setBal(20000);
		return acc2;
		}
	
	@Bean()
	public Account account3(){
		Account acc3= new Account();
		acc3.setAccno(103);
		acc3.setAtype("SA");
		acc3.setBal(100000);
		return acc3;
		
	}
	
	@Bean(name="cust")
	public Customer customer(Address add){
		Customer cust = new Customer(101,"Ravi","ravichandola94@gmail.com",9999L);
		cust.setAddress(add);
		return cust;
	}
}
