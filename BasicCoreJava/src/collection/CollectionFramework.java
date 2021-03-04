package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionFramework {

	//Collection is a framework in java which comes with multiple interfaces and classes 
	//which helps us to handle the data which is growing and shrinking in nature
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		
		list.add("Santosh");
		list.add("Shubhangi");
		list.add("Anjali");
		list.add("Santosh");
		list.add("Shubhangi");
		list.add("Anjali");
		
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("*************");
		
		list= new LinkedList<>();
		
		list.add("Santosh");
		list.add("Shubhangi");
		list.add("Anjali");
		list.add("Santosh");
		list.add("Shubhangi");
		list.add("Anjali");
		
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("*************");
		
		list= new Vector<>();
		
		list.add("Santosh");
		list.add("Shubhangi");
		list.add("Anjali");
		list.add("Santosh");
		list.add("Shubhangi");
		list.add("Anjali");
		
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}
