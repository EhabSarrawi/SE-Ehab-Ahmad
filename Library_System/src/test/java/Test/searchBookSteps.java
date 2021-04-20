package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.*;
import librarysystem.Book;
import librarysystem.User;

public class searchBookSteps {
	private  ArrayList <User> A1= new ArrayList <User>();
	private List <List<String>> S1;
	private  ArrayList <Book> B1= new ArrayList <Book>();
	private  ArrayList <User> U1= new ArrayList <User>();

	private List <List<String>> A2;
	private User User_1 = null;
	private Book book = null;
	private Book book1 = null;
	private User inUser;
	

	@Given("these are the users we will but it in the table as a format User\\(Name,password,user_level,status) noting that user level_{int} is Admin and user level_{int} is a normal user and status indicates whether user is logged in or not")
	public void these_are_the_users_we_will_but_it_in_the_table_as_a_format_user_name_password_user_level_status_noting_that_user_level_is_admin_and_user_level_is_a_normal_user_and_status_indicates_whether_user_is_logged_in_or_not(Integer int1, Integer int2, io.cucumber.datatable.DataTable dataTable) {
		A2= dataTable.asLists() ;
		for(int i=0;i<A2.size();i++) {
			String A = A2.get(i).get(0);
			String [] data = A.split(",");
			U1.add(new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true")));
			 User_1 = new User(data[0],data[1],Integer.parseInt(data[2]),data[3].equalsIgnoreCase("true"));

			
		}
	    
	}

	@Given("these are books and we will but it in the table as format Book\\(Title,author,signature,isbn,borrowed)")
	public void these_are_books_and_we_will_but_it_in_the_table_as_format_book_title_author_signature_isbn_borrowed(io.cucumber.datatable.DataTable dataTable) {
	 
		A2= dataTable.asLists() ;
		for(int i=0;i<A2.size();i++) {
			String A = A2.get(i).get(0);
			String [] data = A.split(",");
			B1.add(new Book(data[0],data[1],data[2],data[3],data[4].equalsIgnoreCase("true")));
			 book1 = new Book(data[0],data[1],data[2],data[3],data[4].equalsIgnoreCase("true"));

		}

	}
	@When("User or Admin want to search for a book by a subtitle like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_a_subtitle_like(String string) {
		book1.searchforAll(B1, string);
		assertTrue(true);

		
		
	}

	@Then("The book should be appeared")
	public void the_book_should_be_appeared() {	
		if(book1.checkifabookExcist(B1.get(0).getAuthor())) {
			assertFalse(false);
  }
		else {
			assertTrue(true);

		}


	}

	@When("User or Admin want to search for a book by a subauthor like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_a_subauthor_like(String string) {
		book1.searchforAll(B1, string);
		assertTrue(true);


	   
	}

	@When("User or Admin want to search for a book by a subISBN like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_a_sub_isbn_like(String string) {
		book1.searchforAll(B1, string);
		assertTrue(true);
	}

	@When("Admin with username {string} and password {string} wants to search for a book like {string}")
	public void admin_with_username_and_password_wants_to_search_for_a_book_like(String string, String string2, String string3) {
		book1.searchforbookwhileIn(B1, U1, string, string2, string3);
		assertTrue(true);

	
	}

	@When("User or Admin want to search for a book by substring like {string}")
	public void user_or_admin_want_to_search_for_a_book_by_substring_like(String string) {
	 
      book1.searchforunexsictBook(B1, string);
		assertFalse(false);

      
	}

	@Then("Warning massege will appeared")
	public void warning_massege_will_appeared() {
	   book1.checkwhenthereisnoBook(B1.get(0).getTitle());
		assertFalse(false);

	}
	@When("User or Admin want to search for more than one book like {string}")
	public void user_or_admin_want_to_search_for_more_than_one_book_like(String string) {
		book1.searchingformorethanBook(B1, string);
		assertTrue(true);

	   
	}

	

	@Then("The books should be appeared")
	public void the_books_should_be_appeared() {
		if(book1.checkifthereismorethanaBook(B1.get(0).getTitle())) {
			assertTrue(true);   

			
		}
		else {
		assertFalse(false);
		}
	  
	}

}
