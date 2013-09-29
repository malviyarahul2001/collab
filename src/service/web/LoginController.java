package service.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.action.LoginManager;
import service.action.Login;


public class LoginController extends SimpleFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private LoginManager loginManager;

    public ModelAndView onSubmit(Object command) throws Exception {

        String username = ((Login) command).getUsername();
        String password = ((Login) command).getPassword();

        System.out.println("Got password " + password);
        System.out.println("Got username " + username);
        
        boolean isvalid = false;
        
        
      
        	if(username != null && !username.equalsIgnoreCase("") && password != null && !password.equalsIgnoreCase(""))
            	isvalid = loginManager.validLogin(username, password);
        
	        ModelAndView modelAndView = null;
	        	
	       	try{ 	
	        	if(isvalid)
	            {
	            	System.out.println("Is valid");
	                
	                Map<String, Object> myModel = new HashMap<String, Object>();
	                
	                
	                 modelAndView = new ModelAndView("messages","model",myModel);
	                
	            }
	            else
	            {
	            	
	            	System.out.println("Is invalid");
	            	Map<String, Object> myModel = new HashMap<String, Object>();
	                myModel.put("invalid", "Invalid Username or Passowrd");
	                
	                 modelAndView = new ModelAndView("login","model",myModel);
	                
	                
	            }
	        }
	        catch (Exception e){
	        	System.out.println("LoginController:::An exception occured while "
	        			+ "checking the user authentication" + e.getStackTrace());
	        }
	        
	        return modelAndView;
        
    }

    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        Login login = new Login();
        return login;
    }

    public void setLoginManager(LoginManager loginManager) {
        this.loginManager = loginManager;
    }

    public LoginManager getLoginManager() {
        return loginManager;
    }

}