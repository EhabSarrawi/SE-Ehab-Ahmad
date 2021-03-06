package Test;

import io.cucumber.java.en.*;

public class logoutSteps {
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level one is Admin and user level two is a normal user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_one_is_admin_and_user_level_two_is_a_normal_user_and_status_indicates_whether_user_is_logged_in_or_not(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@When("Admin {string} is already logged in and Admin press logout")
	public void admin_is_already_logged_in_and_admin_press_logout(String string) {
	   
	}

	@Then("System will exit")
	public void system_will_exit() {
	   
	}
}
