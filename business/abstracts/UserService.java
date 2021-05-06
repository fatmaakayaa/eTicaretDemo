package business.abstracts;

import entities.concerete.User;

public interface UserService {
	public void signIn(String email,String password);
	public void signOut(String email,String password);
	public void register(User user);
}
