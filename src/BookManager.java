import java.util.ArrayList;

public class BookManager {
	private ArrayList<Book> listBook;
	
	public BookManager() {
		
	}

	public BookManager(ArrayList<Book> listBook) {
		this.listBook = listBook;
	}
	
	public Book getMostPriceBook() {
		Book bookHaveMaxPrice  = null;
		long maxPrice = 0;
		for(Book bookElement: listBook) {
			long currentPrice = bookElement.calculatorCost();
			if(currentPrice > maxPrice) {
				bookHaveMaxPrice = bookElement;
				maxPrice = currentPrice;
			}
		}
		return bookHaveMaxPrice;
	}
	
}
