package dataAccess.concerete;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concerete.User;

public class UserInMemoryDao implements UserDao {
	
	List<String> eMailList = new ArrayList<String>();
	List<User> userList = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		
		this.userList.add(user);
		this.eMailList.add(user.geteMail());
		System.out.println("Kullanýcý baþarýlý bir þekilde sisteme eklendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<String> getMailList(){
		return this.eMailList;
	}
	
	@Override
	public List<User> getAllUsers(){
		return this.userList;
	}
}
