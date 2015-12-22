/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ness.academy.dao;

import com.ness.academy.bean.User;
import com.ness.academy.connection.DataSourceInstance;
import com.ness.academy.connection.QueryInstance;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author P3502442
 */
//@XmlRootElement(name = "users")
//@XmlAccessorType (XmlAccessType.FIELD)
public class UserDao implements IUserDao{

    List<User> users=new ArrayList<User>();
    List<User> admins=new ArrayList<User>();
    List<User> customers=new ArrayList<User>();
   
    DataSourceInstance ds;
    
    @Override
    public void add(User user) {
        
        users.add(user);
    }
    //@XmlElement(name = "user")
    
    //modify method -> separate closing connection functionality !!!
    //FIXME
    @Override
    public List<User> users() {
        DataSource ds = DataSourceInstance.getInstance().getDataSource();
        String sql = QueryInstance.getInstance().getQuery("users");
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = ds.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Users ID="+rs.getInt("id")+", Login="+rs.getString("login"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
                try {
                    if(rs != null) rs.close();
                    if(stmt != null) stmt.close();
                    if(con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return users;
    }

    @Override
    public List<User> admins() {
        for(User user:users)
            if(user.isAdmin()==true)
                admins.add(user);
        return admins;
    }

    @Override
    public List<User> customers() {
        for(User user:customers)
            if(user.isAdmin()==false)
                customers.add(user);
        return customers;
    }
    
    //FIXME
    @Override
    public void modify(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public User findById(String id) {
        for (int i = 0; i < users().size(); i++) {
              if (users().get(i).getId() == id) {
                return users().get(i);
              }
            }
            return null;
    }

    @Override
    public User findByLogin(String login) {
        for (int i = 0; i < users().size(); i++) {
              if (users().get(i).getLogin() == login) {
                return users().get(i);
              }
            }
            return null;
    }

    
}
