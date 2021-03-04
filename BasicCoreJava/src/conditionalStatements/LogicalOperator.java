package conditionalStatements;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//AND
		/*
		int a=10;
		int b=50;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
		}else if (b>c && b>a) {
			System.out.println("b is greatest");
		}else {
			System.out.println("c is greatest");
		}
		*/
		
		//OR
		
		int state= 81;
		int iit=30;
		
		if(state>=80 || iit>=50)
		{
			System.out.println("You are eligible");
		}
	}

}
