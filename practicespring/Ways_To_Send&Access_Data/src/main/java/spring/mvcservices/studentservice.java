package spring.mvcservices;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvcModel.Student;
import spring.mvcdao.StudentDao;


@Service
public class studentservice {
	
	@Autowired
	private StudentDao studentDao;
	
	public int createstudent(Student std) {
		return  this.studentDao.savedata(std);
	}
	
	public List<Student> getlist(){
		
		List<Student> std=this.studentDao.getdata();
		
		if(std==null) {
			System.out.println("best");
		}
		return std;
		
	}

}
