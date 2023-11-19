class Library{                              //class
	String []books;
	int no_of_books=0;
	
	Library(){                                //constructor
		this.books = new String[100]; 
		this.no_of_books = 0;
	}
	void addBook(String book) {
		this.books[no_of_books] =book;
		no_of_books++;
		System.out.println(book+ "has been added!");
	}
	
	void showAvailableBooks() {
		System.out.println("Available Books are: ");
		for (String book : this.books) {
			System.out.println("*"+ book);
			
		}
	}
}
 
public class V51_Ch10_Online_Librarry {
public static void main(String[]args) {
	// you have to implemet  a library using jav class library 
	// methos= addBook, issueBook, returnBook, showAvailableBooks
	// properties= araay to store  the available books
	// array to store the issued books
	
	
	Library centralLibrary = new Library();
	centralLibrary.addBook("THINK AND GROW RICH");
	centralLibrary.showAvailableBooks();
	
/*	op THINK AND GROW RICHhas been added!
	Available Books are: 
		*THINK AND GROW RICH
		*null
		*null
		*null
		*null
		*null
		*null
		*null
		*null
		*null
		*null
		*null*/
		
	
}
}
