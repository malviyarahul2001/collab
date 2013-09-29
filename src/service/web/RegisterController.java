package service.web;

import hack.persistence.model.User;

import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.action.RegisterManager;
import service.web.container.UserDetails;

public class RegisterController extends SimpleFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private RegisterManager registerManager;

    public ModelAndView onSubmit(Object command) throws ServletException 
    {
        UserDetails userdetails = ((UserDetails) command);
        System.out.println("Got user " + userdetails.getUser().getName().toString());
        
        boolean userExists = registerManager.checkUserExistence(userdetails.getUser());
    	if(!userExists)
    	{
    		registerManager.register(userdetails.getLogindetails(), userdetails.getUser());
    	}
    	else
    	{
    		System.out.println("Username Already Exists !!!");
    	}
        
        return new ModelAndView(new RedirectView(getSuccessView()));
    }

    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        UserDetails user = new UserDetails();
        return user;
    }

    public void setRegisterManager(RegisterManager registerManager) {
        this.registerManager = registerManager;
    }

    public RegisterManager getRegisterManager() {
        return registerManager;
    }

}