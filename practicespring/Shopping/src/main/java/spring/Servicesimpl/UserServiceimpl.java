package spring.Servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.Dao.UserDao;
import spring.Models.User;
import spring.Services.UserService;

@Service("userService")
public class UserServiceimpl implements UserService {
	
	
	@Autowired
	private UserDao userDao;

	
	public int savedate(User u) {
		
		return userDao.savedate(u);
	}

	public void deletedate(int id) {
		userDao.deletedata(id);
		 
	}


	public void updatedate(User u) {
		userDao.updatedate(u);
		
	}

	
	public User readdate(int id) {

		
		return userDao.getdata(id);
	}

}
