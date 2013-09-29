package service.web;

import hack.persistence.model.Query;
import hack.persistence.model.User;

import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.action.PostQuery;

public class QueryController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private PostQuery query;

    public ModelAndView onSubmit(Object command) throws ServletException 
    {
        Query querydetails = ((Query) command);
        System.out.println("Got Query from " + querydetails.getUser().getName().toString());
        
        return new ModelAndView();
    }

}