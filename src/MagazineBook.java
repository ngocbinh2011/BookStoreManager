import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MagazineBook extends Book{
	private Date releaseDate;
	private String releaseCompany;
	
	
	public MagazineBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MagazineBook(String name, long historicalCost) {
		super(name, historicalCost);
		// TODO Auto-generated constructor stub
	}
	
	public MagazineBook(String name, long historicalCost, long page, int amount, 
			String releaseDate, String releaseCompany) {
		super(name, historicalCost, page, amount);
		try {
			this.releaseDate = (new SimpleDateFormat("dd/mm/yyyy")).parse(releaseDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.releaseCompany = releaseCompany;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	@Override
	public long calculatorCost() {
		// TODO Auto-generated method stub
		long price = getHistoricalCost();
		return price + price * 10 / 100;
	}
	
	@Override
	public void inputInformation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		super.inputInformation();
		System.out.print("day/month/year release = ");
		String days = scanner.nextLine();
		try {
			setReleaseDate((new SimpleDateFormat("dd/mm/yyyyy")).parse(days));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("release company = ");
		setReleaseCompany(scanner.nextLine());
		scanner.close();
	}
	
	@Override
	public void showInformationBook() {
		// TODO Auto-generated method stub
		super.showInformationBook();
		System.out.println("release Date: " + (releaseDate == null? null : 
			(new SimpleDateFormat("dd/mm/yyyy")).format(releaseDate)));
		System.out.println("release Company: " + releaseCompany);
	}
	
	@Override
	public long totalAmountOfRemainingProducts() {
		// count total cost of all remaining product
		return getAmount() * calculatorCost();			
	}
	
	@Override
	public long totalTaxAmount() {
		long taxInOneProduct = getHistoricalCost() * 10 / 100;
		return taxInOneProduct * getAmount();
	}
	
}
