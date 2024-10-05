package spring.Models;



import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.ColumnDefault;

@Entity(name = "Userdata")
public class User  implements Serializable {
	
	
	 private static final long serialVersionUID = 1L;
	 
	@javax.persistence.Id
	@GeneratedValue(generator = "user_gen" ,  strategy = GenerationType.AUTO)
	@SequenceGenerator(name="student_gen",sequenceName = "user_seq",initialValue = 100,allocationSize = 1)
	private long Id;
	
	
	private String Name;
	private String LastName;
	private String Gender;
	
	private String Email;
	private String Mobno;
	private String Password;
	
	@ColumnDefault("default.png")
	private String Profilepic;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobno() {
		return Mobno;
	}
	public void setMobno(String mobno) {
		Mobno = mobno;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getProfilepic() {
		return Profilepic;
	}
	public void setProfilepic(String profilepic) {
		Profilepic = profilepic;
	}
	public User(int id, String name, String lastName, String gender, String email, String mobno, String password,
			String profilepic) {
		super();
		Id = id;
		Name = name;
		LastName = lastName;
		Gender = gender;
		Email = email;
		Mobno = mobno;
		Password = password;
		Profilepic = profilepic;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", LastName=" + LastName + ", Gender=" + Gender + ", Email="
				+ Email + ", Mobno=" + Mobno + ", Password=" + Password + ", Profilepic=" + Profilepic + "]";
	}
	
	
	
	
	
}
