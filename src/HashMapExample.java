import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {
				
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Alex");
		map.put(2, "Two");
		map.put(5, "Five");
		map.put(1, "One");
		map.put(1, "Oneeeee");
		
		//Get Value
		//String text = map.get(1);
		//System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ":" + value);
		}
	}

}
