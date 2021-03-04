package loops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] arr= new String[3];
		
		arr[0]="Anjali";
		arr[1]="Shubhangi";
		arr[2]="Santosh";
		
		for(int i=0; i<3; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("*********************");
		for(String s : arr)
		{
			System.out.println(s);
		}
		
		//10, 20, 30
	}
}
