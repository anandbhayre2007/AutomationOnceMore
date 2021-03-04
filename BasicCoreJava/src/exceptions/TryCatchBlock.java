package exceptions;

import oops.inheritence.Telephone;

public class TryCatchBlock {

	static Telephone phone;
	
	public static void main(String[] args) {
		
		try {
			//1. Arithmetic Exception
			System.out.println(10/0);
			
			int[] arr= {10,20,30};
			 System.out.println(arr[4]);
			
			phone.calling();
			
			String name="anand";
			System.out.println(name.charAt(6));
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		/*
		 * //2. StringIndexOutOfBoundsException String name="anand";
		 * System.out.println(name.charAt(6));
		 * 
		 * //3. ArrayIndexOutOfBoundsException int[] arr= {10,20,30};
		 * System.out.println(arr[4]);
		 * 
		 * //4. NullPointerException phone.calling();
		 */

	}

}
