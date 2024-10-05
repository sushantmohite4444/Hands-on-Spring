package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Useinterface implements InitializingBean,DisposableBean{
	private int prise;

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	@Override
	public String toString() {
		return "Useinterface [prise=" + prise + "]";
	}

	
	public void afterPropertiesSet() throws Exception {
	System.out.println("inside init method of interface method");
	}


	public void destroy() throws Exception {
		System.out.println("indide destroy of interface method");
		
	}
	

}
