package Test;

import io.cucumber.java.en.*;

public class searchbookSteps {
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level_{int} is Admin and user level_{int} is a normal user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_normal_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Given("these are books and we will but it in the table as format Book\\(Title,author,signature,isbn,borrowed)")
	public void these_are_books_and_we_will_but_it_in_the_table_as_format_book_title_author_signature_isbn_borrowed(io.cucumber.datatable.DataTable dataTable) {
	    
	}

	@When("User or Admin want to search for a book by a subtitle like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_a_subtitle_like(String string) {
	    
	}

	@Then("The book should be appeared")
	public void the_book_should_be_appeared() {
	  
	}

	@When("User or Admin want to search for a book by a subauthor like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_a_subauthor_like(String string) {
	   
	}

	@When("User or Admin want to search for a book by a subISBN like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_a_sub_isbn_like(String string) {
	   
	}

	@When("Admin with username {string} and password {string} wants to search for a book like {string}")
	public void admin_with_username_and_password_wants_to_search_for_a_book_like(String string, String string2, String string3) {
	   
	}

	@When("User or Admin want to search for a book by substring like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_substring_like(String string) {
	   
	}

	@Then("Warning massege will appeared")
	public void warning_massege_will_appeared() {
	   
	}

	@When("User or Admin want to search for more than one book like {string} and {string}")
	public void user_or_admin_want_to_search_for_more_than_one_book_like_and(String string, String string2) {
	   
	}

	@Then("The books should be appeared")
	public void the_books_should_be_appeared() {
	   
	}
}
