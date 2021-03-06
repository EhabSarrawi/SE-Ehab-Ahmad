package Test;

import java.util.ArrayList;
import java.util.List;


import io.cucumber.java.en.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import Library_System.Book;
import Library_System.User;
public class addbookSteps {
	private  ArrayList <User> u1= new ArrayList <User>();
	private  ArrayList <Book> b1= new ArrayList <Book>();
	private List <List<String>> l1;
	private List <List<String>> l2;
	private User inUser = null;
	private Book book=null;

	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level {int} is Admin and user level {int} is a  user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
		l1= dataTable.asLists() ;
		for(int i=0;i<l1.size();i++) {
			String a = l1.get(i).get(0);
			String [] data = a.split(",");
			u1.add(new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true")));
	}}

	@Given("these are book and we will but it in the table as format Book\\(Title,author,signature,isbn,borrowed)")
	public void these_are_book_and_we_will_but_it_in_the_table_as_format_book_title_author_signature_isbn_borrowed(io.cucumber.datatable.DataTable dataTable) {
		l2= dataTable.asLists() ;
		for(int i=0;i<l2.size();i++) {
			String a = l2.get(i).get(0);
			String [] data = a.split(",");
			b1.add(new Book(data[0],data[1],data[2],data[3],data[4].equalsIgnoreCase("true")));
	}}

	@When("Admin with username {string} is already logged in add a book with title {string} and author {string} and signature {string} and isbn {string} and borrowed {string}")
	public void admin_with_username_is_already_logged_in_add_a_book_with_title_and_author_and_signature_and_isbn_and_borrowed(String string, String string2, String string3, String string4, String string5, String string6) {
		inUser =new User(string,null,1,true);
		book=new Book(string2,string3,string4,string5,false);
	    book.Addbook(u1, b1, string, string2, string3, string4, string5, string6);
	}

	@Then("Book will be added")
	public void book_will_be_added() {
	    assertTrue(inUser.isStatus());
	}

	@When("Admin with username {string} is not logged in and try to add book")
	public void admin_with_username_is_not_logged_in_and_try_to_add_book(String string) {
		inUser =new User(string,null,1,false);
		book= new Book(null,null,null,null,false);
	    book.NotAdmin(u1, string);
	}

   

	@Then("Book should be not added")
	public void book_should_be_not_added() {
	    assertFalse(inUser.isStatus());
	}
}
