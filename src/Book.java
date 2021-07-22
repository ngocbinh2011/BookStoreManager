import java.util.Scanner;

public abstract class Book {
	
	private String name;
	private long historicalCost;
	private long page;
	private int amount;
	
	public Book() {
		
	}
	
	public Book(String name, long historicalCost) {
		this.historicalCost = historicalCost;
		this.name = name;
	}

	public Book(String name, long historicalCost, long page, int amount) {
		this(name, historicalCost);
		this.page = page;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getHistoricalCost() {
		return historicalCost;
	}

	public void setHistoricalCost(long historicalCost) {
		this.historicalCost = historicalCost;
	}

	public long getPage() {
		return page;
	}

	public void setPage(long page) {
		this.page = page;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
		
	public void showInformationBook() {
		System.out.println("name: " + name);
		System.out.println("historical Cost: " + historicalCost);
		System.out.println("number of page: " + page);
		System.out.println("amount: " + amount);
	}
	
	public long increaseCostByPercent(long percent) {
		if(percent < 0) {
			System.out.println("percent is not less than 0");
			return 0;
		}
		long newPrice = historicalCost + historicalCost * percent / 100;
		return newPrice;
	}
	
	public long decreaseCostByPercent(long percent) {
		if(percent < 0) {
			System.out.println("percent is not less than 0");
			return 0;
		}
		if(percent > 100) {
			System.out.println("percent is not greater than 100");
			return 0;
		}
		long newPrice = historicalCost - historicalCost * percent / 100; 
		return newPrice;
	}
	
	public void inputInformation() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("name = ");
		setName(scanner.nextLine());
		System.out.print("historical cost = ");
		setHistoricalCost(scanner.nextLong());
		System.out.print("number of page = ");
		setPage(scanner.nextLong());
		System.out.println("amount = ");
		setAmount(scanner.nextInt());
	}
	
	public abstract long calculatorCost(); 
	public abstract long totalAmountOfRemainingProducts(); // get total remaining product
	public abstract long totalTaxAmount(); // get total tax of product
	
	
}
