package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		
		obj.privateFunction();
		obj.publicFunction();
		obj.protectedFunction();
		obj.defaultFunction();
	}

	private void privateFunction()
	{
		System.out.println("Private function");
	}
	
	public void publicFunction()
	{
		System.out.println("Public function");
	}
	
	void defaultFunction()
	{
		System.out.println("Default function");
	}
	
	protected void protectedFunction()
	{
		System.out.println("Protected Function");
	}
}
