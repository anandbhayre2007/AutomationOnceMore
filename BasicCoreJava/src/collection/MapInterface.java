package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map= new HashMap<>();
		
		map.put("name1", "Anjali");
		map.put("name2", "Shubhangi");
		map.put("name3", "Santosh");
		map.put(null, "Temp");
		System.out.println(map.get(null));
		
		System.out.println("***************");
		
		Set<String> set=map.keySet();
		
		for(String s:set)
		{
			System.out.println(map.get(s));
		}
		
		/*
		map= new Hashtable<>();
		
		map.put("name1", "Anjali");
		map.put("name2", "Shubhangi");
		map.put("name3", "Santosh");
		map.put(null,"Temp3");
		System.out.println(map.get(null));
		*/
		

	}

}
