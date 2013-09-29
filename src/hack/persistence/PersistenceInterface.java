package hack.persistence;

import hack.persistence.model.LoginDetails;
import hack.persistence.model.Query;
import hack.persistence.model.User;

/**
 * This class holds the interface will be used to implement interaction 
 * @author rahul
 *
 */
public interface PersistenceInterface 
{
    public LoginDetails getLoginDetails(String user);
    
    public void addLoginDetails(LoginDetails loginDetails);
    
    public User getUser(String username);
    
    public void setUser(User user);
    
    public Query getQuery(long id);
    
    public void setQuery(long id, Query query);
}
