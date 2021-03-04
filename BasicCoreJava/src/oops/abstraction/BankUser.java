package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		BankUser b= new BankUser();
		b.bankFearures(new HDFC());
		b.bankFearures(new ICICI());
		b.bankFearures(new RBL());
	}
	
	public  void bankFearures(RBI ref)
	{
		ref.savingAccount();
		ref.creditCard();
		ref.currentAccount();
		ref.debitCard();
		ref.savingAccount();
	}
	
	public static void sum(int a , int b)
	{
		System.out.println(a+b);
	}

}
