package functions;

public class NonStaticFunction {

	public static void main(String[] args) {
		
		//<--Reference---->   <--Object--------------->
		NonStaticFunction ref= new NonStaticFunction();
		
		
		int sum=ref.sum(10, 20);
		
		System.out.println(sum);
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}

	//Thumb Rule1: Static functions can only call static members of a class (variables, methods)
	//Thumb Rule2: To call non static functions/variables inside a static function you need to create an object
}
