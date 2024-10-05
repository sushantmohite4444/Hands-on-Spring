package standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructorinjection.student;

public class Text {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("standalonecollection/alonecong.xml");
		 Studentgf gfs=ac.getBean("stud1" ,Studentgf.class);
		 System.out.println(gfs);
	}

}
