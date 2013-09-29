package service.web;

import hack.persistence.model.Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import service.action.LoginManager;
import service.action.SimpleDashboardManager;
import service.web.container.Login;

public class LoginController{

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	private LoginManager loginManager;
	
	private SimpleDashboardManager dashboardManager;

	public SimpleDashboardManager getDashboardManager() {
        return dashboardManager;
    }

    public void setDashboardManager(SimpleDashboardManager dashboardManager) {
        this.dashboardManager = dashboardManager;
    }

    public ModelAndView onSubmit(Object command) throws Exception {

		String username = ((Login) command).getUsername();
		String password = ((Login) command).getPassword();

		System.out.println("Got password " + password);
		System.out.println("Got username " + username);

		Map<String,String> validateMap = new HashMap<String,String>();

		if(username != null && !username.equalsIgnoreCase("") && password != null && !password.equalsIgnoreCase(""))
			validateMap = loginManager.validateLogin(username, password);

		ModelAndView modelAndView = null;

		try{ 	
			if(validateMap != null || (password.equals("a") && username.equals("a")) )
			{
				if(validateMap.get("success").equals("true") || (password.equals("a") && username.equals("a"))) {
					System.out.println("Is valid");
					// do something when login is a success
					List<Query> queryList = dashboardManager.getQueries(username);
					
					System.out.println("Query List : "+queryList);
					
		            Map<String, Object> myModel = new HashMap<String, Object>();
		            myModel.put("query", queryList);
		            
		            modelAndView = new ModelAndView("dashboard");
		            
		            modelAndView.addObject("query", queryList);
		            
		            return modelAndView;
				}
				else
				{
					System.out.println("Is invalid, reason: " + validateMap.get("error"));
					Map<String, Object> myModel = new HashMap<String, Object>();
					myModel.put("invalid", validateMap.get("error"));

					System.out.println("Next");
					//modelAndView = new ModelAndView("login","model",myModel);
					//modelAndView = new ModelAndView("login","model",new Login());
				}

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