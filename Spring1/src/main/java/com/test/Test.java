package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Student student = (Student)context.getBean("s");
		Student student = (Student)context.getBean(Student.class);
		System.out.println(student);
	}
}
