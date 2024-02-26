package lbms;

import java.io.Closeable;
import java.util.Scanner;

public class LibraryManagement
{
	 public static void main(String[] args)
	 {
	        Library library = new Library();

	        // Adding sample books to the library
	        library.addBook(new Book("The India Story", "Bimal Jalal", "9780743273565", true));
	        library.addBook(new Book("A Place Called Home", "Preeti Shenoy", "9780061120084", true));
	        library.addBook(new Book("Hear Yourself", "Prem Rawat", "9780451524935", true));
	        library.addBook(new Book("The Indian Mutiny", "Sir Hugh Rose", "9780486284736", true));
	        library.addBook(new Book("Queen of Fire", "Devika Rangachari", "9780316769488", true));
	        library.addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki and Sharon Lechter", "9780428769488", true));
	        library.addBook(new Book("The Maverick Effect", "Harish Mehta", "97803897769488", true));
	        library.addBook(new Book("Monsoon", "Sahitya Akademi", "9780316788488", true));
	        library.addBook(new Book("The Little Book of Joy", "Dalai Lama & Desmond Tutu", "9780316755488", true));
	        

	        Scanner scanner = new Scanner(System.in);

	        while (true) 
	        {
	            System.out.println("\n--- Library Management System ---");
	            System.out.println("1. Display Available Books");
	            System.out.println("2. Borrow a Book");
	            System.out.println("3. Return a Book");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice)
	            {
	                case 1:
	                    library.displayAvailableBooks();
	                    break;
	                case 2:
	                    System.out.print("Enter the ISBN of the book you want to borrow: ");
	                    String borrowISBN = scanner.nextLine();
	                    library.borrowBook(borrowISBN);
	                    break;
	                case 3:
	                    System.out.print("Enter the ISBN of the book you want to return: ");
	                    String returnISBN = scanner.nextLine();
	                    library.returnBook(returnISBN);
	                    break;
	                case 0:
	                    System.out.println("Exiting the program. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	        
	 }
}
