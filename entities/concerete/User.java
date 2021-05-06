package entities.concerete;

import core.abstracts.AccountService;
import entities.abstracts.Entity;

public class User implements Entity{
	
	private boolean status;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	AccountService accountService;

	public User(String eMail, String password, AccountService accountService) {
		super();
		this.eMail = eMail;
		this.password = password;
		this.accountService = accountService;
		this.status = false;
	}

	public User(String firstName, String lastName, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.status = false;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
