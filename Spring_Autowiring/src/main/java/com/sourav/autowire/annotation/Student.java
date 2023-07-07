package com.sourav.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Autowired
	@Qualifier("addressTwo")
	//by default call constructor
	private Address address;

	/*
	 * public Student(Address address) { System.out.println("Constructor Di");
	 * this.address = address; }
	 */

	public Address getAddress() {
		return address;
	}

	//@Autowired
	//for call the seeter method
	public void setAddress(Address address) {
		System.out.println("Setter Di");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
