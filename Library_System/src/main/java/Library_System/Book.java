package Library_System;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Book{
	private String title;
	private String author;
	private String signature;
	private String isbn;
	private boolean borrowed;
	private User inUser;
	
	public Book(String title, String author, String signature, String isbn, boolean borrowed) {
	
		this.title = title;
		this.author = author;
		this.signature = signature;
		this.isbn = isbn;
		this.borrowed = borrowed;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	
	public void Addbook(ArrayList<User> u1,ArrayList<Book> b1,String string, String string2, String string3, String string4, String string5, String string6) {
		boolean e=false;
		boolean check = false;
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())&&u1.get(i).isAnAAdmin()) {
				inUser=u1.get(i);
				if(inUser.isStatus()) {
					 check=checkisbn(string5);
					if(check) {
						b1.add(new Book(string2,string3,string4,string5,false));
						e=check;
					}
					else {
						e=check;
					}	
				}
				else {e=check;}
			}
			
		}
		assertTrue(e);
	}
	public boolean checkisbn(String ISBN) {
		int sum=0;
		int t;
		int result;
		String [] sp=ISBN.split("");
		if(ISBN.length()==10) {
		  int m=10;
		for (int i=0;i<sp.length;i++) {
		  t=Integer.parseInt(sp[i]);
		  result= t*m;
		  m--;
		  sum+=result;
		}
		if(sum%11==0) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
		
	}
	
	public void NotAdmin(ArrayList<User> u1,String string) {
		
		int t=-1;
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())) {
				inUser=u1.get(i);
				if(inUser.isAnAAdmin()) {
					if(!inUser.isStatus()) {
						t=i;
					}
					else {t=-1;}
				}
				else {
					t=-1;
				}
			}		 				
		}			

		assertTrue(t!=-1);
	}
	
}