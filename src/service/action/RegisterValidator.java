package service.action;


import java.util.logging.Logger;

import service.web.container.UserDetails;

public class RegisterValidator{

    /** Logger for this class and subclasses */

    public boolean supports(Class clazz) {
        return UserDetails.class.equals(clazz);
    }
    
    
    public void validate(Object target) {
		
	}
}