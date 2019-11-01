
public class TestReferences {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		System.out.println("balance of First account: " + firstAccount.balance);
		
		Account secondAccount = firstAccount;
		System.out.println("balance of Second account: " + secondAccount.balance);
		
		secondAccount.balance += 100;
		System.out.println("balance of Second account: " + secondAccount.balance);
		
		System.out.println(firstAccount.balance);
		
		if (firstAccount == secondAccount) {
			System.out.println("they are the same account");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
