package service.action;

import hack.persistence.model.LoginDetails;
import hack.persistence.model.User;

import java.io.Serializable;

public interface RegisterManager extends Serializable{
    
    public boolean checkUserExistence(User user);

	public void register(LoginDetails logindetails, User user);
    
}
