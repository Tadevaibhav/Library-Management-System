package lbms;
public class Book
{
	 private String title;
	    private String author;
	    private String ISBN;    //International standard book number
	    private boolean available;
	    public Book()
	    {
			// TODO Auto-generated constructor stub
		}

	    public Book(String title, String author, String ISBN, boolean available)
	    {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	        this.available = available;
	    }

	    // Getters and setters

	    public String getTitle()
	    {
	        return title;
	    }

	    public void setTitle(String title) 
	    {
	        this.title = title;
	    }

	    public String getAuthor() 
	    {
	        return author;
	    }

	    public void setAuthor(String author) 
	    {
	        this.author = author;
	    }

	    public String getISBN()
	    {
	        return ISBN;
	    }

	    public void setISBN(String ISBN) 
	    {
	        this.ISBN = ISBN;
	    }

	    public boolean isAvailable()
	    {
	        return available;
	    }

	    public void setAvailable(boolean available)
	    {
	        this.available = available;
	    }

	    @Override
	    public String toString()
	    {
	        return "Book{" +
	                "title='" + title +'\'' +
	                ", author='" + author + '\'' +
	                ", ISBN='" + ISBN + '\'' +
	                ", available=" + available +
	                '}';
	    }

}