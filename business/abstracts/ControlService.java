package business.abstracts;

import java.util.List;

import entities.concerete.User;

public interface ControlService {
	public boolean checkInformations(User user, List<String> emailList);
	public boolean checkeMmail(User user, List<String> emailList);
	public boolean checkPassword(int passwordLength);
	public boolean checkName(String firstName,String lastName);
}
