package springExpression;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springExprssion/Expression.xml");
		Expression gfs=ac.getBean("one" ,Expression.class);
		 System.out.println(gfs);
	}
}
