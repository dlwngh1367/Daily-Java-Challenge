
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
				
//		juhosAccount.withdrawal(100.0);
//		
//		juhosAccount.deposit(50.0);
//		juhosAccount.withdrawal(100.0);
//		
//		juhosAccount.deposit(51.0);
//		juhosAccount.withdrawal(100.0);
//		
		Account timsAccount = new Account("Tim", "time@email.com", "12345");
		System.out.println(timsAccount.getNumber() + "Name" + timsAccount.getCustomerName());
		System.out.println("Current balance is " + timsAccount.getBalance());
		timsAccount.withdrawal(100.55);
		
//		VipPerson person1 = new VipPerson();
//		System.out.println(person1.getName());
//		
//		VipPerson person2 = new VipPerson("Bob", 25000.00);
//		System.out.println(person2.getName());
//		VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
//		System.out.println(person3.getName());
//		System.out.println(person3.getEmailAddress());
	}
	

}
