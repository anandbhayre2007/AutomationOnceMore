package functions;

public class FunctionsClass1 {

	public static void main(String[] args) {
		
		/*
		 * int a=10; int b=20; System.out.println(a+b);
		 * 
		 * //30, 40 int c=30; int d=40; System.out.println(c+d);
		 * 
		 * //50, 60 int e=50; int f=60; System.out.println(e+f);
		 */
		
		sum(10, 20);
		sum(30, 40);
		sum(50, 60);
		
		name("Anand");
	}
	
	//Accesss Modifier //Type of function  //Return Type  //name  //Parameters
	public               static              void           sum   (int a, int b)
	{
		System.out.println(a+b);
	}

	//Your name is Anjali/Santosh/Shubhangi
	public static void name(String name)
	{
		System.out.println("Your name is "+name);
	}
	
	
}
