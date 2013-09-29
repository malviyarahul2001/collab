package service.action;

import hack.persistence.PersistenceInterface;
import hack.persistence.impl.SimplePersistenceImpl;
import hack.persistence.model.LoginDetails;

import java.util.List;

public class SimpleLoginManager implements LoginManager {

    private static final long serialVersionUID = 1L;

    public boolean validLogin(String username, String password) {
    	
    	PersistenceInterface persistance = new SimplePersistenceImpl();
    	
        LoginDetails logindetails = persistance.getLoginDetails(username);
        
        return false;
    }

}
