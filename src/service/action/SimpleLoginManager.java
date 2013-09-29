package service.action;

import hack.persistence.PersistenceInterface;
import hack.persistence.impl.SimplePersistenceImpl;
import hack.persistence.model.LoginDetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLoginManager implements LoginManager {

    private static final long serialVersionUID = 1L;

    public Map<String, String> validateLogin(String username, String password) {
    	
    	PersistenceInterface persistance = new SimplePersistenceImpl();
    	Map<String, String> validateMap = new HashMap<String, String>();
    	
        LoginDetails logindetails = persistance.getLoginDetails(username);
        
        if(logindetails == null) {
        	validateMap.put("success", "false");
        	validateMap.put("error", "user not registered");
        }
        else {
        	if(logindetails.getPassword().equals(password))
        		validateMap.put("success", "true");
        	else {
            	validateMap.put("success", "false");
            	validateMap.put("error", "Invalid Password");
        	}
        }
        	
        
        return validateMap;
    }

}
