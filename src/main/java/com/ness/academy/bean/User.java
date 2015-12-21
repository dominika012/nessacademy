
package com.ness.academy.bean;

import java.util.UUID;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

public class User {
            String id;
            String login;
            String password;
	    boolean isAdmin;
	    
	    public User(){
	    }
	    
		public User(String login, String password, boolean isAdmin) {
			super();
                        this.id = UUID.randomUUID().toString();
			this.login = login;
			this.password = password;
			this.isAdmin = isAdmin;
		}

		public String getId() {
			return id;
		}

                public void setId() {
			this.id = UUID.randomUUID().toString();
		}
                
		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}
	    
                
                @Override
		public String toString() {
                    String rights = "";
                        if (isAdmin==true) rights="yes";
                        else rights="no";
			return "User: login = " + login + " .Has Admin rights? " + rights;
		}
    
}
