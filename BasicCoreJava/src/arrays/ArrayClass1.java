package arrays;

public class ArrayClass1 {

	public static void main(String[] args) {
		String name="Anand";
		
		//Anand, Shubhangi, Santosh
		
		String[] arr=new String[3];
		
		arr[0]="anand";
		arr[1]="Sailaja";
		arr[2]="Santosh";
		
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);*/
		
		System.out.println(arr.length);

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
