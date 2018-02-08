import model.Book;
import model.Customer;

public class Main {

	public static void main(String[] args) {
	
		Book book1 = new Book(1001, "Dragonlance","Laura&Tracy Hickman", "5829");
		Book book2 = new Book(1002, "The Hobbit", "JRR Tolkien", "1827");
		
		System.out.println(book1);
	}
}
