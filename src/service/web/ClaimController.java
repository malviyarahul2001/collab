package service.web;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.action.ClaimQuery;
import service.web.container.Claim;

public class ClaimController{

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private ClaimQuery claimQuery;
    
    public ModelAndView onSubmit(Object command) throws ServletException 
    {
        Claim claim = ((Claim) command);
        System.out.println("Got Claim from " + claim.getUser().getName().toString());
        
        return new ModelAndView();
    }

}