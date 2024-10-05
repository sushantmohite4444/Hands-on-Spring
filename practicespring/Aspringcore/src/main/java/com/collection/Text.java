package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/collection/configemp.xml");
     Employees emp1=  (Employees) ac.getBean("emp1");
      
	 System.out.println(emp1);
	}

}
