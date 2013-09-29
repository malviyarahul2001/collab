package service.action;

import service.web.container.Login;

public class LoginValidator{

    public boolean supports(Class clazz) {
        return Login.class.equals(clazz);
    }
    
    
    public void validate(Object target) 
    {
	}
}