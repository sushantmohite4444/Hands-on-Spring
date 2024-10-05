package autowiring;


public class Address {
	private String street;
	private String lean;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLean() {
		return lean;
	}
	public void setLean(String lean) {
		this.lean = lean;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", lean=" + lean + "]";
	}
	
}
