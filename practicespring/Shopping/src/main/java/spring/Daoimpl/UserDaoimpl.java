package spring.Daoimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.Dao.UserDao;
import spring.Models.User;

@Repository("userDao")
public class UserDaoimpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional(readOnly = false)
	public int savedate(User u) {
		
		
		int i = (Integer)   hibernateTemplate.save(u);
		
		
		return i;
		
	}
	
	
	
	public  void deletedata (int id) {
		
		hibernateTemplate.delete(id);
		
	}
	
	@Transactional
	
	public void updatedate(User id) {
		
		
	hibernateTemplate.update(id);
	}

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	public User getdata(int id) {
		
		
		 User u= (User)  hibernateTemplate.get(User.class, id);
		  
		 return u;
	}


	

}
