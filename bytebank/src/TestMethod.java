public class TestMethod {
		
	public static void main(String[] args) {
			 Account accountOfMurillo = new Account();
			 accountOfMurillo.balance = 100;
			 accountOfMurillo.deposits(50);
			 System.out.println(accountOfMurillo.balance);
			 
			 boolean doWithdraw = accountOfMurillo.withdraw(20);
			 System.out.println(accountOfMurillo.balance);
			 System.out.println(doWithdraw);
			 
			 Account accountOfDaniela = new Account();
			 accountOfDaniela.deposits(1000);
			 
			 boolean sucessTransfer = accountOfDaniela.transfer(300, accountOfMurillo);
			 
			 if(sucessTransfer) {
				 System.out.println("transfer successfully!");
				 
			 } else {
				 System.out.println("out of money!");
				 
			 }
			 System.out.println(accountOfDaniela.balance);
			 System.out.println(accountOfMurillo.balance);
			 
			 accountOfMurillo.holder = "Murillo Alves";
			 System.out.println(accountOfMurillo.holder);
	}
}
