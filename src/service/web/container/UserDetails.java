package service.web.container;

import hack.persistence.model.LoginDetails;
import hack.persistence.model.User;

public class UserDetails {

	public UserDetails() {}
	
	User user;
	LoginDetails logindetails;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LoginDetails getLogindetails() {
		return logindetails;
	}
	public void setLogindetails(LoginDetails logindetails) {
		this.logindetails = logindetails;
	}

	
}
