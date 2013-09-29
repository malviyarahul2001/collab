package service.action;

import hack.persistence.PersistenceInterface;
import hack.persistence.model.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PostQuery {
	
	public PostQuery() {}
	
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    PersistenceInterface persistence;

    public boolean postQueryFromUser(Query query) {
    	persistence.setQuery(query);
    	return true;
    }

}
