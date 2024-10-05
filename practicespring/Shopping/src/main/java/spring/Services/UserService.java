package spring.Services;

import spring.Models.User;

public interface UserService {

	int savedate(User u) ;
	void deletedate(int id);
	void updatedate(User u);
	User readdate(int id);
	

	

	

}
