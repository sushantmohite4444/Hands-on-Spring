package spring.Dao;

import spring.Models.User;

public interface UserDao {

	int savedate(User u);

	User getdata(int id);

	void deletedata(int id);

	void updatedate(User u);

}
