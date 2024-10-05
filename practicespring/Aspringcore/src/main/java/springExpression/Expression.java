package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("one")
public class Expression {
	@Value("#{T(java.lang.Math).sqrt(10)}")
	private double d;
	
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	
	@Value("#{new java.lang.String('sush')}")
	private String name;


	@Value("#{5>3}")
	private boolean op;
	
	@Value("#{T(springExprssion.Expression2).getBool(false)}")
	private boolean jonathan;

	@Override
	public String toString() {
		return "Expression [d=" + d + ", e=" + e + ", name=" + name + ", op=" + op + ", jonathan=" + jonathan + "]";
	}


	
	
	

	
	
}
