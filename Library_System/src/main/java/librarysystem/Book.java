package librarysystem;


import java.util.ArrayList;

import java.util.List;


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
	
	
	public void addBook(List<User> u1,List<Book> b1,String string, String string2, String string3, String string4, String string5) {
		
		boolean check = false;
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())&&u1.get(i).isAnAAdmin()) {
				inUser=u1.get(i);
				if(inUser.isStatus()) {
					 check=checkisbn(string5);
					if(check) {
						b1.add(new Book(string2,string3,string4,string5,false));
						break;
					}
						
				}
				}			
		}
		
	}
	public boolean checkisbn(String isbn) {
		boolean string1=false;
		int sum=0;
		int t;
		int result;
		String [] sp=isbn.split("");
		if(isbn.length()==10) {
		  int m=10;
		for (int i=0;i<sp.length;i++) {
		  t=Integer.parseInt(sp[i]);
		  result= t*m;
		  m--;
		  sum+=result;
		}
		if(sum%11==0) {
			string1=true;
		}
	
		}
	
		return string1;
	}
	
	public void notAdmin(List<User> u1,String string) {
		
		 
		for(int i=0;i<u1.size();i++) {
			if(string.equals(u1.get(i).getUsername())) {
				inUser=u1.get(i);
				if(inUser.isAnAAdmin()&&!(inUser.isStatus())) {
				
						break;
										
				}
			}		 				
		}			

		
	}
	public void searchforAll(List<Book> b1,String g) {
		Book b2=new Book(null,g,null,null,true);
		ArrayList<Book> l1=new ArrayList<>();
		for(int i=0;i<b1.size();i++) {
           l1.add(b2);
    	 if(b1.get(i).getTitle().contains(g)||b1.get(i).getAuthor().contains(g)||b1.get(i).getIsbn().contains(g)&&b2.checkifthereismorethanaBook(l1.get(i).getAuthor())) {
    		 break;
    
     			     }
    		
    	 }
	}



public void searchforbookwhileIn(List<Book> b1,List<User> u1,String g1,String g2,String g3) {


for(int i=0;i<u1.size();i++) {
if(g1.equals(u1.get(i).getUsername())&&g2.equals(u1.get(i).getPassword())&&b1.get(1).getTitle().contains(g3)) {
break;
}
}

}

public void searchforunexsictBook(List<Book> b1,String g) {
Book e1=new Book(g,null,null,null,false);

for(int i=0;i<b1.size();i++) {
if(!(b1.get(i).getTitle().contains(g))&&!(e1.getTitle().equals(b1.get(i).getTitle()))) {
e1.checkwhenthereisnoBook(g);
}
}




}
public void searchingformorethanBook(List<Book> b1,String g) {
Book n1=new Book(g,null,null,null,true);

ArrayList<Book> l1=new ArrayList<>();
for(int i=0;i<b1.size();i++) {
if(b1.get(i).getTitle().contains(g)){
l1.add(n1);

if(n1.checkifthereismorethanaBook(l1.get(0).getTitle())) {
	n1.checkifthereismorethanaBook(l1.get(0).getTitle());
}
}

}

}	

public boolean checkifabookExcist(String string) {
	boolean string1=false;
	if (!(string.equals(""))) {
	    string1=true;
	}
		
	
	return string1;
}
public boolean checkifthereismorethanaBook(String string) {
	boolean string1=false;
	if (string!=null) {
	    string1=true;
	} 
	return string1;
}
public boolean checkwhenthereisnoBook(String string) {
	boolean string1=true;
	if (string!=null) {
	    string1=false;
	} 
	return string1;
}

}
	
