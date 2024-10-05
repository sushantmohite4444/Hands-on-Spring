package spring.mvcModel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String pass;
	
	public Student() {
	
	}
	public int getId() {
		System.out.println("sldfkj");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Student(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", pass=" + pass + "]";
	}
	
	
}
