package functions;

public class Overloading {

	public static void main(String[] args) {
		sum(10,20);
		
		//10, 20, 30

	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
		
	public static void sum(String a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void eligibility(int age, boolean maritalStatus)
	{
		
	}
	
	public static void eligibility(boolean maritalStatus, int age)
	{
		
	}
	
	//Method overloading: same method name with different parameters
	//Different parameters:
	//1. increase the number of parameters,
	//2 decrease the number of parameters,
	//3 change the data type, 
	//4 swap the parameters

}
