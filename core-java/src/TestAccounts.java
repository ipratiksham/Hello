
public class TestAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts a1 = new Accounts(1001, "Zubair",5000);
		a1.summary();
		
		a1.deposit(2000);
		a1.summary();
		
		a1.withdraw(4000);
		a1.summary();
		
		a1.withdraw(5000);
	}

}
