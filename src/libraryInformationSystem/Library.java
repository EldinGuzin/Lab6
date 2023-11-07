package libraryInformationSystem;
import java.util.*;

public class Library {

	List<Book> library = new ArrayList<>();
	public Library() {
		
	}
	
	public void addBook(Book newBook) {
		library.add(newBook);
	}
	
	public void printBooks() {
		
		for(Object b : library) {
			System.out.println(b);
			System.out.println();
		}
	}
	
}
