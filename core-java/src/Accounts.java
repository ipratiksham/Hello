
public class Accounts {
	private int actNo;
	private String holder;
	private double balance;
	private static int counter;
	
	static {
		System.out.println("Accounts class loaded...");
		counter = 1001;
	}
	
	public Accounts() {
		
	}
	
	public Accounts(int actNo, String holder, double balance) {
		this.actNo = actNo;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C No: " + actNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}
}

