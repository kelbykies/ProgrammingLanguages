import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book
{
	private String authorLName;
	private int libraryCode;
	private String titleOfBook;
	
	public Book(String titleOfBook, String authorLName, int libraryCode)
	{
		this.titleOfBook = titleOfBook;
		this.authorLName = authorLName;
		this.libraryCode = libraryCode;
	}
	
	public int compareBooks(Book book)
	{
		if(this.titleOfBook.compareTo(book.titleOfBook) == 0)
		{
			if(this.authorLName.compareTo(book.authorLName) == 0)
			{
				if(this.libraryCode < book.libraryCode)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
			else
			{
				return this.authorLName.compareTo(book.authorLName);
			}
		}
		else
		{
			return this.titleOfBook.compareTo(book.titleOfBook);
		}
	}
	
	public String toString()
	{
		String message = "Title: " + titleOfBook + " Author Last Name: "
					+ authorLName + " Library Code: " + libraryCode;
		return message;
	}
}
