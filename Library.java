package lbms;
import java.util.ArrayList;
import java.util.List;

public class Library 
{
	 private List<Book> books;

	    public Library()
	    {
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) 
	    {
	        books.add(book);
	    }
	     
	    public void displayAvailableBooks()
	    {
	        System.out.println("Available Books:");
	        for (Book book : books)
	        {
	            if (book.isAvailable())
	            {
	                System.out.println(book);
	            }
	        }
	    }

	    public void borrowBook(String ISBN) 
	    {
	        for (Book book : books)
	        {
	            if (book.getISBN().equals(ISBN)) 
	            {
	                if (book.isAvailable()) 
	                {
	                    book.setAvailable(false);
	                    System.out.println("Book borrowed successfully!");
	                } else 
	                {
	                    System.out.println("Book is not available for borrowing."
	                    		+ "plese visit After some days");
	                }
	                return;
	            }
	        }
	        System.out.println("Book not found in the library.");
	    }

	    public void returnBook(String ISBN)
	    {
	        for (Book book : books)
	        {
	            if (book.getISBN().equals(ISBN))
	            {
	                book.setAvailable(true);
	                System.out.println("Book returned successfully!");
	                return;
	            }
	        }
	        System.out.println("Book not found in the library.");
	    }
}