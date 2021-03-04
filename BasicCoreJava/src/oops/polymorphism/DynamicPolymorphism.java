package oops.polymorphism;

import oops.inheritence.Mobile;
import oops.inheritence.Smartphone;
import oops.inheritence.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Telephone phone;
		
		phone=new Telephone();
		
		phone=new Mobile();
		
		phone=new Smartphone();		
		
		phone.calling();
		
		//whenever we have parent class reference for the child class object, 
		//we can only those functions which are present in parent class
		//but overridden will get call from child class
	}

}
