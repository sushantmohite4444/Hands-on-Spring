package stereotypeanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructorinjection.student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(" stereotypeanno/sterotypeconfig.xml");
		
		
		Students stud = ac.getBean("stud1",Students.class);
		System.out.println(stud);
		System.out.println(stud.hashCode());
		
		Students stud1 = ac.getBean("stud1",Students.class);
		System.out.println(stud1.hashCode());
	}

}
