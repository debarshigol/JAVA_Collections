package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class MapCreation {

	public static void main(String[] args) {
		// creating a map
		Map<String,Integer> map = new HashMap<>();
		// adding a key-value pairs in the map
		map.put("Apple", 10);
		map.put("Banana", 12);
		map.put("Pinapple", 7);
		map.put("Orrange", 12);
		// accessing the value
		int count = map.get("Apple");
		System.out.println("Total apple: "+count);
		// size of the map
		System.out.println("Sie of the map: "+map.size());
		// check if any key is present or not
		if(map.containsKey("Banana")) {
			System.out.println("Banana is present inside map");
		}
		else {
			System.out.println("Banana is not present inside map");
		}
		// check all the map element
		for (String key: map.keySet()) {
			System.out.printf("%s: %d\n",key,map.get(key));
		}
	}

}
