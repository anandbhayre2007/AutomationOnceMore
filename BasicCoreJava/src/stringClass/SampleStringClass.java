package stringClass;

public class SampleStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Anand";
		System.out.println(name);
		
		//Function 1
		System.out.println(name.length());
		
		//Function 2
		System.out.println(name.charAt(4));
		
		//Function 3
		System.out.println(name.toUpperCase());
		
		//Function 4
		System.out.println(name.toLowerCase());
		
		//Function 5
		System.out.println(name.trim());
		
		//Function 6
		System.out.println(name.replace("n", "1"));
		
		//Split
		String temp="Hi my name is Anand";
		String[] str=temp.split(" ");
		
		System.out.println(str.length);
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		//Equals
		System.out.println(name.equals(temp));
		
		//Equal Ignore Case
		System.out.println(name.equalsIgnoreCase(temp));
		
		//sub string
		System.out.println(temp.substring(14));
		
		System.out.println(temp.substring(11, 13));
		
		//anjali
		//Hi My name is Anand==> iH yM eman si dnanA
		//a=10, b=20 b=10, a=20
		
		
		
		
		
		

	}

}
