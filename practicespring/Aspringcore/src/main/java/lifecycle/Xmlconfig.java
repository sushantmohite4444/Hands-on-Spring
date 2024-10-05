package lifecycle;

public class Xmlconfig {
	private  int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy methods");
	}

	@Override
	public String toString() {
		return "Xmlconfig [price=" + price + "]";
	}
}
