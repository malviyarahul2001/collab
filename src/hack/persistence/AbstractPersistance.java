package hack.persistence;

import java.util.HashMap;

import hack.persistence.model.LoginDetails;
import hack.persistence.model.Query;
import hack.persistence.model.User;

/**
 * By default we implement the logic using simple hashmap
 * 
 * @author rahul
 *
 */
public abstract class AbstractPersistance implements PersistenceInterface 
{
    private HashMap<String, LoginDetails> m_LoginDetails = new HashMap<String, LoginDetails>();
    
    private HashMap<String, User> m_User = new HashMap<String, User>();
    
    private HashMap<Long, Query> m_Query = new HashMap<Long, Query>();
    
    public LoginDetails getLoginDetails(String user)
    {
        return m_LoginDetails.get(user);
    }
    
    public void addLoginDetails(LoginDetails loginDetails)
    {
        m_LoginDetails.put(loginDetails.getUserName(), loginDetails);
    }
    
    public User getUser(String username)
    {
        return m_User.get(username);
    }   
    
    public void setUser(User user)
    {
        m_User.put(user.getName(), user);
    }
    
    public Query getQuery(long id)
    {
        return m_Query.get(id);
    }
    
    public void setQuery(long id, Query query) 
    {
        m_Query.put(id, query);
    }
}
