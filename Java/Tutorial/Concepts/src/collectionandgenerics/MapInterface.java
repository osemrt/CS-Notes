package collectionandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Hashtable is synchronized. (Thread safe)
 * Hasmap is not synchronized. (not Thread safe) 
 * 
 */

public class MapInterface {
	public static void main(String args[]) {
	
		Map<String, String> map = new HashMap<>();
		map.put("Tom", "Red");
		map.put("Bob", "Blue");
		map.put("Henry", "Black");
		map.put("Tom", "Yellow");
		
		System.out.println(map);
		System.out.println(map.get("Henry"));
		System.out.println(map.get("Eric"));
		
		System.out.println("------------------------");
		
		Set<String> mapList = map.keySet();
		
		for(String s : mapList) {
			System.out.println(s + " " + map.get(s));
		}
		
		System.out.println("------------------------");
		
		Set<Map.Entry<String, String>> values = map.entrySet();
		for(Map.Entry<String, String> i  : values) {
			//System.out.println(i);
			
			System.out.println(i.getKey() + " : " + i.getValue());
		}
		
		
	}

}
