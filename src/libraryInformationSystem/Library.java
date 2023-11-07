package libraryInformationSystem;
import java.util.*;
import java.util.stream.Collectors;

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
	
	
	
	public ArrayList<Book> searchByTitle(String title){
		
		return (ArrayList<Book>) library
				.stream()
				.filter(book -> book.title().equals(title) )
				.collect(Collectors.toList());
	}
	
	public ArrayList<Book> searchByPublisher(String publisher){
		
		return (ArrayList<Book>) library
				.stream()
				.filter(book -> book.publisher().equals(publisher))
				.collect(Collectors.toList());
	}
	
	public ArrayList<Book> searchByYear(int year){
		
		return (ArrayList<Book>) library
				.stream()
				.filter(book -> book.year() == year)
				.collect(Collectors.toList());
		
	}
	
	
}
