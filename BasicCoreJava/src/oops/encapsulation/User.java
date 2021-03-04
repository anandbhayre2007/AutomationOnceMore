package oops.encapsulation;

public class User {

	public static void main(String[] args) {
		
		SampleClass obj= new SampleClass();
		
		obj.setAge(-10);
		
		System.out.println(obj.getAge());
		
		obj.setName("Anand");
		System.out.println(obj.getName());
	}

}
