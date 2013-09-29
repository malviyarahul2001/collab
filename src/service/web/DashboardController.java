package service.web;

import hack.persistence.PersistenceInterface;
import hack.persistence.model.Query;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import service.web.container.Login;

public class DashboardController{

    PersistenceInterface persistance;
    
    public List<Query> getQueries(String username)
    {
        return null;
    }
    
    public PersistenceInterface getPersistance() {
        return persistance;
    }
    
    public void setPersistance(PersistenceInterface persistance) {
        this.persistance = persistance;
    }
    
    public ModelAndView onSubmit(Object command) throws Exception {

        String username = ((Login) command).getUsername();
        String password = ((Login) command).getPassword();

        System.out.println("Got password " + password);
        System.out.println("Got username " + username);
        ModelAndView modelAndView = null;

        System.out.println("In dashboard");
        // do something when login is a success

        return modelAndView;

    }

    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        Login login = new Login();
        return login;
    }
    
}