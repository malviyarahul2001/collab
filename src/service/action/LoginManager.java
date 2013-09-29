package service.action;

import java.io.Serializable;


public interface LoginManager extends Serializable{

    public boolean validLogin(String username, String password);
    
}
