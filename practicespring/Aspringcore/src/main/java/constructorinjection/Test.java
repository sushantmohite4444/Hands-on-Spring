package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("constructorinjection/constructor.xml");
	      Employees emp1=  (Employees) ac.getBean("emp1");
			System.out.println(emp1);
		}

	}


