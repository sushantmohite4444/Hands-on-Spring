package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/reference/referencedemo.xml");
	    Employees e=   (Employees) ac.getBean("emp1");
		
		System.out.println(e);
		

	}

}
