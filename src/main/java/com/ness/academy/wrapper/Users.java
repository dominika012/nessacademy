/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ness.academy.wrapper;

import com.ness.academy.bean.User;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Wrapper for User
//this class is nedeed for XML I/O

@XmlRootElement(name = "users")
@XmlAccessorType (XmlAccessType.FIELD)
public class Users {
    @XmlElement(name = "user")
    private List<User> users = null;
 
    public List<User> getUsers() {
        return users;
    }
 
    public void setUsers(List<User> users) {
        this.users = users;
    }
}
