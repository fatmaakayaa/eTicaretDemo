package dataAccess.abstracts;

import java.util.List;

import entities.concerete.User;

public interface UserDao {
	void add(User user);
	List<String> getMailList();
	List<User> getAllUsers();
	

}
