package service.action;

import hack.persistence.model.User;

import java.io.Serializable;

public interface RegisterManager extends Serializable{

    public void register(User user);
    
    public boolean checkUserExistence(User user);
    
}
