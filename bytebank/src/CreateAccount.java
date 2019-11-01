
public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account(); 
		firstAccount.balance = 200;
		System.out.println(firstAccount.balance);
		
		firstAccount.balance += 100;
		System.out.println(firstAccount.balance);
		
		Account secondAccount = new Account();
		secondAccount.balance = 300;
		
		System.out.println("Second Account have: " + secondAccount.balance);
		System.out.println("First Account have: " + firstAccount.balance);
		
		firstAccount.agency = 146;
		System.out.println(firstAccount.agency);
		System.out.println(firstAccount.number);
		
			System.out.println(secondAccount.agency);
		
		secondAccount.agency = 146;
		System.out.println("now the second account is in the same agency: " + secondAccount.agency);
		
		if (firstAccount == secondAccount) {
			System.out.println("same account");
		} else {
			System.out.println("different accounts");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
	}
}
