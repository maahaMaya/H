package com.sourav.autowired.xml;

public class Student {
	private Address address;

	public Student(Address address) {
		System.out.println("Constructor Di");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter Di");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
