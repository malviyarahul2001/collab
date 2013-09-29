package service.action;

import hack.persistence.PersistenceInterface;
import hack.persistence.model.Query;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import service.web.container.Login;

public class SimpleDashboardManager implements Serializable
{
    private static final long serialVersionUID = 1L;

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

        Map<String,String> validateMap = new HashMap<String,String>();

//        if(username != null && !username.equalsIgnoreCase("") && password != null && !password.equalsIgnoreCase(""))
//            validateMap = loginManager.validateLogin(username, password);

        ModelAndView modelAndView = null;

        try{    
            if(validateMap != null)
            {
                if(validateMap.get("success").equals("true")) {
                    System.out.println("Is valid");
                    // do something when login is a success
                    
//                    List<Query> queyList = 
//                    
//                    Map<String, Object> myModel = new HashMap<String, Object>();
//                    myModel.put("query", queryList);
//                    
//                    modelAndView = new ModelAndView("query","model",myModel);
//                    
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

//    public void setLoginManager(LoginManager loginManager) {
//        this.loginManager = loginManager;
//    }
//
//    public LoginManager getLoginManager() {
//        return loginManager;
//    }
//    
}
