package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
   //ApplicationContext ac = new ClassPathXmlApplicationContext("lifecycle/configlife.xml");
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("lifecycle/configlife.xml");
		ac.registerShutdownHook();
		
		Xmlconfig xm =(Xmlconfig) ac.getBean("p1");
		System.out.println(xm);
		
		Useinterface uf= (Useinterface) ac.getBean("up1");
		 System.out.println(uf);
		
		 Useannotation ur= (Useannotation) ac.getBean("ua1");
		 System.out.println(ur);
		 
	}

}
