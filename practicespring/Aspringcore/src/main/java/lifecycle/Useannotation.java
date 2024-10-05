package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Useannotation {
	private int price ;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Useannotation [price=" + price + "]";
	}
	@PostConstruct
	public void hay() {
		System.out.println("init method of annotation");
	}
	@PreDestroy
	public void bye() {
		System.out.println("destroy method of annotation");
	}
}
