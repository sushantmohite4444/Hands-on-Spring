package spring.mvcdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.mvcModel.Student;



@Repository
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional(readOnly = false)
	
	public int savedata(Student std)
	{
	int id= (Integer)	hibernateTemplate.save(std);
		return id;
	}
	
	
	
	public List<Student> getdata() {
		
		List<Student> std= hibernateTemplate.loadAll(Student.class);
		if(std==null) {
			System.out.println("best");
		}
		return std;
		
	}

	

	public HibernateTemplate getHibernateTemplate() {
		return this.hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
