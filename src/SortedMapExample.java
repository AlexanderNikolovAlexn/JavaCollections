import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
				
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map){
		System.out.println(map.getClass());
		System.out.println("------------------------");
		
		map.put(9, "fox");
		map.put(4, "swan");
		map.put(8, "dog");
		map.put(1, "cat");
		map.put(0, "snake");
		map.put(15, "giraffe");
		map.put(6, "wolf");
		
		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}

}

