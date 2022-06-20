
public class Main_BankAccount {

	public static void main(String[] args) {
		
		Account juhosAccount = new Account();//"12345",0.00,"Juho Lee", "juholee@juho.com","(613)-123-4567");
		System.out.println(juhosAccount.getNumber());
		System.out.println(juhosAccount.getBalance());
		
	//	juhosAccount.setNumber("6777-12837-123");
	//	juhosAccount.setBalance(0.00);
	//	juhosAccount.setCustomername("Juho Lee");
	//	juhosAccount.setCustomerEmailAddress("juholee@juho.com");
	//	juhosAccount.setCustomerPhoneNumber("(613) 123-4567");
				
		juhosAccount.withdrawal(100.0);
		
		juhosAccount.deposit(50.0);
		juhosAccount.withdrawal(100.0);
		
		juhosAccount.deposit(51.0);
		juhosAccount.withdrawal(100.0);
	}

}
