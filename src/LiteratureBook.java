import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LiteratureBook extends Book {
	private String author;
	private long releaseYear;
	
	public LiteratureBook() {
		
	}

	public LiteratureBook(String name, long historicalCost) {
		super(name, historicalCost);
		// TODO Auto-generated constructor stub
	}
	
	public LiteratureBook(String name, long historicalCost, long page, int amount, String author, long releaseYear) {
		super(name, historicalCost, page, amount);
		this.author = author;
		this.releaseYear = releaseYear;
		// TODO Auto-generated constructor stub
	}
	
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(long releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public long calculatorCost() {
		// TODO Auto-generated method stub
		long price = getHistoricalCost();
		return price + price * 5 / 100;
	}
	
	@Override
	public void inputInformation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		super.inputInformation();
		System.out.print("author = ");
		setAuthor(scanner.nextLine());
		System.out.print("release Year = ");
		setReleaseYear(scanner.nextLong());
	}
	
	@Override
	public void showInformationBook() {
		// TODO Auto-generated method stub
		super.showInformationBook();
		System.out.println("author: " + author);
		System.out.println("release Year: " + releaseYear);
	}
	
	@Override
	public long totalAmountOfRemainingProducts() {
		// count total cost of all remaining product
		return getAmount() * calculatorCost();
	}
	
	@Override
	public long totalTaxAmount() {
		long taxInOneProduct = getHistoricalCost() * 5 / 100;
		return taxInOneProduct * getAmount();
	}
	
	public int countYearFromReleaseYearToNow() {
		// count number of year from release year to now
		Date dateNow = new Date();
		String year = (new SimpleDateFormat("yyyy")).format(dateNow);	
		return (int) (Integer.parseInt(year) - releaseYear);
	}
	
}
