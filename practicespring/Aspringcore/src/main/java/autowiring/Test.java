package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("autowiring/autoconfig.xml");
		Employees e = ac.getBean("obj", Employees.class);
		System.out.println(e);
	}

}
