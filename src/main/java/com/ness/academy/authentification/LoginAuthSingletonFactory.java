
package com.ness.academy.authentification;

import com.ness.academy.bean.User;
import com.ness.academy.dao.UserDao;


public class LoginAuthSingletonFactory {
    
    public static final LoginAuthSingletonFactory INSTANCE = new LoginAuthSingletonFactory();
    
    
    static private LoginAuthSingletonFactory loginAuthSingletonFactory = new LoginAuthSingletonFactory();

    private UserDao userDao=null;
    
    private LoginAuthSingletonFactory() {
    }
    
    public static LoginAuthSingletonFactory getLoginAuthSingletonFactory(){
        return loginAuthSingletonFactory;
    }
    
    public boolean isAuthentificated(String login, String password){
        for(User user:userDao.users())
            if(user.getLogin().equals(login) && user.getPassword().equals(password))
                return true;
        return false;
    }
}
