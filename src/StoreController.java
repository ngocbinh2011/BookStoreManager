import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class StoreController {
	public static void main(String[] args) {
		
		System.out.println("-----------SACH VAN HOC------------");
		LiteratureBook literatureBook = null; 
		literatureBook = new LiteratureBook("sach van hoc", 100000, 30, 5, "nguyen dinh thi", 2005);
		
		literatureBook.showInformationBook();
		System.out.println("real price of product after add tax 5%: " + literatureBook.calculatorCost());
		System.out.println("totalAmountOfRemainingProducts: " + literatureBook.totalAmountOfRemainingProducts());
		System.out.println("totalTaxAmount: " + literatureBook.totalTaxAmount());
		System.out.println("countYearFromReleaseYearToNow: " + literatureBook.countYearFromReleaseYearToNow());
		System.out.println("price after increase 20%: " + literatureBook.increaseCostByPercent(20));
		System.out.println("price after decresea 15%: " + literatureBook.decreaseCostByPercent(15));
		
		System.out.println("-----------SACH TAP CHI------------");
		MagazineBook magazineBook = null;
		magazineBook = new MagazineBook("sach tap chi", 200000, 40, 6, "20/1/2005", "TXT company");
		magazineBook.showInformationBook();
		System.out.println("real price of product after add tax 10%: " + magazineBook.calculatorCost());
		System.out.println("totalAmountOfRemainingProducts: " + magazineBook.totalAmountOfRemainingProducts());
		System.out.println("totalTaxAmount: " + literatureBook.totalTaxAmount());
		System.out.println("price after increase 21%: " + magazineBook.increaseCostByPercent(20));
		System.out.println("price after decresea 18%: " + magazineBook.decreaseCostByPercent(15));
		
		ArrayList<Book> listBook = new ArrayList<Book>();
		Book book1 = new LiteratureBook("van hoc 1", 988812);
		Book book2 = new LiteratureBook("van hoc 2", 153515);
		Book book3 = new LiteratureBook("van hoc 3", 313133);
		Book book4 = new MagazineBook("tap chi 4", 877131);
		Book book5 = new MagazineBook("tap chi 5", 231311);
		Book book6 = new MagazineBook("tap chi 6", 123131);
		Collections.addAll(listBook, book1, book2, book3, book4, book5, book6);
		
		System.out.println("-----------MOST COST------------");
		BookManager bookManager = new BookManager(listBook);
		
		Book mostValuableBook = bookManager.getMostPriceBook();
		mostValuableBook.showInformationBook();
		System.out.println("real price of product after tax: " + mostValuableBook.calculatorCost() + " dong");
		
		
	}
	
	
	
}
