package stereotypeanno;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component= by default obj name students
@Component("stud1")

//@Scope("prototype") //different class name

public class Students {
	
	
	@Value("sushant")
	private String name;
	@Value("mohite")
	private String lastname;
	@Value("#{list1}")
	private List<String> l;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}



	@Override
	public String toString() {
		return "Students [name=" + name + ", lastname=" + lastname + ", l=" + l + "]";
	}
	
	
}
