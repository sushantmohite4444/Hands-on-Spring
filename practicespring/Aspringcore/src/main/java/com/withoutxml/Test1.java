package com.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student1 s1= ac.getBean("remove",Student1.class);
//		Student1 s1= ac.getBean("stud1",Student1.class);
		System.out.println(s1);
	}

}
