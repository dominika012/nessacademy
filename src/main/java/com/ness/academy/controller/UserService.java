/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.academy.controller;

import com.ness.academy.bean.Product;
import com.ness.academy.bean.User;
import com.ness.academy.dao.UserDao;
import com.ness.academy.gui.FileTestForm;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author P3502442
 */
public class UserService {
    
    private UserDao userDao;
    
    public UserService(){
    userDao = new UserDao();
    }
    
    public boolean canAdd(String login, String password){
        if (login.isEmpty() || password.isEmpty()) 
            for(User user : userDao.users())
                if(user.getLogin().compareTo(login)==0)
            return false;
        return true;
    }
    
    //-------------------------------------------------------------------------
    
    public void add(String login, String password, boolean isAdmin){
        if(canAdd(login, password)==true){
            User user = new User(login, password, isAdmin);
            userDao.add(user);
        }
    }
    
    public List<User> users() {
	return userDao.users();
    }
    
    public List<User> admins() {
	return userDao.admins();
    }
    
    public List<User> customers() {
	return userDao.customers();
    }
    
    public void removeById(String id){
        User user = userDao.findById(id);
        userDao.remove(user);
    }
    public void removeByLogin(String login){
        User user = userDao.findByLogin(login);
        userDao.remove(user);
    }
    
    
    public boolean isAuthentificated(String login, String password){
        for(User user:userDao.users())
            if(user.getLogin().equals(login) && user.getPassword().equals(password))
                return true;
        return false;
    }
    
}
