package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import librarysystem.User;

public class loginSteps {
	private  ArrayList <User> u1= new ArrayList <User>();
	private List <List<String>> l1;
	private User inUser = null;
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level {int} is Admin and user level {int} is a normal user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_normal_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {

		l1= dataTable.asLists() ;
		for(int i=0;i<l1.size();i++) {
			String a = l1.get(i).get(0);
			String [] data = a.split(",");
			u1.add(new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true")));
		}
	}


	
	@When("Admin enters {string} as a user name and enters {string} as password")
	public void admin_enters_as_a_user_name_and_enters_as_password(String string, String string2) {
	    inUser = new User(string,string2,1,false);
	    Assert.assertNotNull(inUser);
	    
	}

	@Then("Admin will login")
	public void admin_will_login() {
		int e=-1;
		for(int i=0;i<u1.size();i++) {
			if(inUser.getUsername().equals(u1.get(i).getUsername())&&inUser.getPassword().equals(u1.get(i).getPassword())&&u1.get(i).isAnAAdmin()&&!u1.get(i).isStatus()) {
				e=i;
				break;
			}
		}
		  Assert.assertNotNull(e);
	}

	@Then("Error messege should be appeared")
	public void error_messege_should_be_appeared() {
		assertFalse(u1.contains(inUser));
	}

}