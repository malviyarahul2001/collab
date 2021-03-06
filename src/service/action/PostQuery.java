package service.action;

import java.util.List;

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
    	
    	List<Query> queries = persistence.getAllQueries();
    	
    	boolean isSame;
    	
    	for(Query existingQuery : queries) {
    		isSame = areQueriesSimilar(existingQuery, query);
    	}
    		
    	persistence.setQuery(query);
    	return true;
    }
    
    public boolean areQueriesSimilar(Query existingQuery, Query newQuery) {
    	
    	String existingTitle = existingQuery.getTitle();
    	String newTitle = newQuery.getTitle();
    	
    	
    	
    	return false;
    }

}
