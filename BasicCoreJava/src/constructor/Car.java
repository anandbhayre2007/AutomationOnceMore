package constructor;

public class Car {
	
	//instance variable
	String model;
	String type; 
	int speed;
	
	//Constructor overloading
	
	//Default constructor
	public Car()
	{
		
	}
	
	//Parameterized constructor
	public Car(String model, String type, int speed)
	{
		this.model=model;
		this.type=type;
		this.speed=speed;
	}
	
	public Car(String model, String type)
	{
		this.model=model;
		this.type=type;
	}
	
	//class variable
	static int wheels=4;
	
	public void features()
	{
		System.out.println("Model="+model+", Type="+type+", wheels="+wheels+", speed="+speed);
	}

}
