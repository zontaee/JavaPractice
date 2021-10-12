package ch08.ch;
import java.util.Arrays;

public class Book {
	
    private String Book;
	    private String name;
	    private String Writer;
	   
	    
	 
	    public Book(String book, String name, String Writer) {
	    	this.Book = book;
	        this.name = name;
	        this.Writer = Writer;
	    }
	 
	    public String getBook() { return Book; }
	    public void setBook(String Book) { this.Book = Book; }
	    public String getname() { return name; }
	    public void setname(String name) { this.name = name; }
	    public String getWriter() { return Writer; }
	    public void setWriter(String Writer) { this.Writer = Writer; }
	  
	    public String toString() {
			return "Book [책 번호=" + Book + ",책 이름=" + name + ",저자= " + Writer + "]";
	    }
	    }
