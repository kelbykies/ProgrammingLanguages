import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class HW7Problem2 {
	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book firstBook = new Book("Into the Wild","Green",126);
		Book secondBook = new Book("The Odyssey","Green",139);
		Book thirdBook = new Book("Into the Wild","Steinkruger",126);
		Book fourthBook = new Book("Into the Wild","Steinkruger",50);
		Book fifthBook = new Book("Game Of Thrones","Green", 126);
		Book sixthBook = new Book("The Immortal Life of Henrietta Lacks","Lacks", 400);
		Book seventhBook = new Book("Abduction", "Klommhaus", 97);
		Book eighthBook = new Book("Abduction", "Klommhaus", 200);
		
		
		bookList.add(firstBook);
		bookList.add(secondBook);
		bookList.add(thirdBook);
		bookList.add(fourthBook);
		bookList.add(fifthBook);
		bookList.add(sixthBook);
		bookList.add(seventhBook);
		bookList.add(eighthBook);
		
		Collections.sort(bookList, (x, y) -> x.compareBooks(y));
		
		for(Book element : bookList)
		{
			System.out.println(element.toString());
		}
	}
}
