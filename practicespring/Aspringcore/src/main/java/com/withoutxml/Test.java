package com.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new AnnotationConfigApplicationContext(JavaConfig.class);
//		ApplicationContext ap = new AnnotationConfigApplicationContext("com.withoutxml");
		Student st =ap.getBean("stud",Student.class);
		System.out.println(st);
	}

}
