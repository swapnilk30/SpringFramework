package com.test;

public class Student {

	private String fullName;
	private int age;
	private String city;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String fullName, int age, String city) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.city = city;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", age=" + age + ", city=" + city + "]";
	}
	
}
