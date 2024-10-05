package com.first.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
      Student std1= (Student) context.getBean("Stud1");
      Student std2= (Student) context.getBean("Stud2");
      System.out.println(std1);
      System.out.println(std2);
      
    }
}
