package service.action;

import java.io.Serializable;
import java.util.Map;


public interface LoginManager extends Serializable{

    public Map<String,String> validateLogin(String username, String password);
    
}
