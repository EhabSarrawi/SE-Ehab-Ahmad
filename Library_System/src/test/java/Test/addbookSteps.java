package Test;

import io.cucumber.java.en.*;

public class addbookSteps {
	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level {int} is Admin and user level {int} is a  user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Given("these are book and we will but it in the table as format Book\\(Title,author,signature,isbn,borrowed)")
	public void these_are_book_and_we_will_but_it_in_the_table_as_format_book_title_author_signature_isbn_borrowed(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin with username {string} is already logged in add a book with title {string} and author {string} and signature {string} and isbn {string} and borrowed {string}")
	public void admin_with_username_is_already_logged_in_add_a_book_with_title_and_author_and_signature_and_isbn_and_borrowed(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Book will be added")
	public void book_will_be_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin is not logged in and try to add book")
	public void admin_is_not_logged_in_and_try_to_add_book() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Book should be not added")
	public void book_should_be_not_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
