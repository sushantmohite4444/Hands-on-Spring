package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Employees {
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	//@Autowired
	public Employees(Address address) {
		super();
		System.out.println("conturctor autowired  injection");
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
 
//	@Autowired
	
//	@Qualifier("address1")
	public void setAddress(Address address) {
		System.out.println("setter autowired injection");
		System.out.println();
		this.address = address;
	}

	

	public Employees() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employees [address=" + address + "]";
	}
	 
}
