package functions;

public class ReturnType {

	public static void main(String[] args) {
		//10, 20

		int sum1=sum(10, 20);
		int sum2=sum(30, 40);
		
		sum(10,20);
		System.out.println(sum1);
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public void message(String message)
	{
		System.out.println(message);
	}
	
	//Assignment 1: create a function for eligibility ( Cet>=80, IIt = 50>=)
	//Assignment 2: param=boolean, on true=" You are eligible" on false="you are not eligible"
	
	//Assignment 3: Create an eligibility function which will accept (age, marrital status)
	//age>=21, marrital status=true

}
