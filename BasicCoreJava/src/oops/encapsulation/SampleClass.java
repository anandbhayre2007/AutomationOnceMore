package oops.encapsulation;

public class SampleClass {

	private int age; //-2147483648 - +2147483648
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		if(name.equals("Anjali"))
		this.name = name;
	}
	
	
}
