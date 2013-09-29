package service.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController{

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
	    String message = "Login page";
	    
	    return new ModelAndView("login", "message", message);
	}
	
}