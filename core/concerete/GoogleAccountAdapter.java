package core.concerete;

import accounts.GoogleAccount;
import core.abstracts.AccountService;

public class GoogleAccountAdapter implements AccountService{
	@Override
	public void signUpSocialAccounts(String email, String password) {
		GoogleAccount googleAccount = new GoogleAccount();
		googleAccount.signUpWithGoogle(email, password);
	}
}
