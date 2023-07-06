package com.sourav.constructor;

import java.util.*;

public class Student {
	private int id;
	private String name;
	private String address;
	private List<String> courses;
	private Certificate certificate;
	
	
	public Student(int id, String name, String address, List<String> courses, Certificate certificate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
		this.certificate = certificate;
	}

	public Student(int id, String name) {
		System.out.println("int string Contructor");
		this.id = id;
		this.name = name;
	}
	
	public Student(String name, int id) {
		System.out.println("string int Contructor");
		this.id = id;
		this.name = name;
	}
	
	public Student(String name, String address) {
		System.out.println("String string Contructor");
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", courses=" + courses
				+ ", certificate=" + certificate + "]";
	}
	

	/*
	 * @Override public String toString() { return "Student [id=" + id + ", name=" +
	 * name + ", address=" + address + "]"; }
	 */

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
	
	
}
