package service.web.container;

import hack.persistence.model.LoginDetails;
import hack.persistence.model.User;
import hack.persistence.model.UserContact;

public class UserDetails {

    private String username;
    
    private String password;
    
    private String tablenum;
    
    private String cellnum;
    
    private String email;
    
	public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTablenum() {
        return tablenum;
    }
    public void setTablenum(String tablenum) {
        this.tablenum = tablenum;
    }
    public String getCellnum() {
        return cellnum;
    }
    public void setCellnum(String cellnum) {
        this.cellnum = cellnum;
    }
    public UserDetails() {}
	
	User user;
	LoginDetails logindetails;
	
	public User getUser() {
	    user = new User();
	    user.setName(username);
	    UserContact userContact = new UserContact();
	    userContact.setCellNumber(cellnum);
	    userContact.setEmail(email);
	    user.setContact(userContact);
	    user.setTableNumber(Integer.parseInt(tablenum));
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LoginDetails getLogindetails() {
	    logindetails = new LoginDetails();
	    logindetails.setPassword(password);
	    logindetails.setUserName(username);
		return logindetails;
	}
	public void setLogindetails(LoginDetails logindetails) {
		this.logindetails = logindetails;
	}

	
}
