package service.action;

import hack.persistence.impl.SimplePersistenceImpl;
import hack.persistence.model.LoginDetails;
import hack.persistence.model.User;


public class SimpleRegisterManager implements RegisterManager 
{

	private static final long serialVersionUID = 1L;
	
	SimplePersistenceImpl persistance;

    @Override
    public void register(LoginDetails logindetails, User user) {
    	persistance.addLoginDetails(logindetails);
    	persistance.setUser(user);
    }
   
    public boolean checkUserExistence(User user)
    {
    	//return loginDao.checkUserExistence(user);
    	return true;
    }
    
    public SimplePersistenceImpl getPersistance() {
        return persistance;
    }
    
    public void setPersistance(SimplePersistenceImpl persistance) {
        this.persistance = persistance;
    }
}
