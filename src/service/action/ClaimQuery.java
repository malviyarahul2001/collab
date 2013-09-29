package service.action;

import hack.persistence.PersistenceInterface;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.web.container.Claim;

public class ClaimQuery {
	
	public ClaimQuery() {}
	
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    PersistenceInterface persistence;
    
    public void addClaim(Claim claim) {
    	persistence.addClaim(claim.getQueryId(), claim.getUser().getName());
    	
    }

}
