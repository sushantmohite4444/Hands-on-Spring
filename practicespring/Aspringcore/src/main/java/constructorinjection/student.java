package constructorinjection;

public class student {
	private int child;

	public student(int child) {
		super();
		this.child = child;
	}

	@Override
	public String toString() {
		return "student [child=" + child + "]";
	}
	
}
