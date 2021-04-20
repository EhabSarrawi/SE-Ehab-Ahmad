package librarysystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
private String username ;
private String password;
private int userLevel;
private boolean status;
Logger logger=Logger.getLogger(User.class.getName());


public User(String username, String password, int userLevel, boolean status) {
	this.username = username;
	this.password = password;
	this.userLevel = userLevel;
	this.status=status;
}

public boolean isStatus() {
	return status;
}

public String getUsername() {
	return username;
}

public String getPassword() {
	return password;
}

public boolean isAnAAdmin() {
	
boolean flag=false;
if(this.userLevel==1) {
flag=true;	
logger.log(Level.INFO,"Admin");
}
return flag;
}


public void logout() {
	status= false;
}


}