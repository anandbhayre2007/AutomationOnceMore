package exceptions;

import oops.inheritence.Telephone;

public class UncheckedException {
	
	static Telephone phone;
	static String    name;
	
	public static void main(String[] args) {
		
		//1. Arithmetic Exception
		//System.out.println(10/0);
		
		//2. StringIndexOutOfBoundsException
		String name="anand";
		//System.out.println(name.charAt(6));
		
		//3. ArrayIndexOutOfBoundsException
		int[] arr= {10,20,30};
		//System.out.println(arr[4]);
		
		//4. NullPointerException
		//phone.calling();
		
	}
}
