import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {

	public static void main(String[] args) {
	
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		testSet(set1);
		//testSet(set2);
		//testSet(set3);
	}
	
	public static void testSet(Set<String> set){
		System.out.println(set.getClass());
		
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("snake");
		set.add("bear");
		
		//add duplicate
		set.add("snake");
		
		System.out.println(set);
		
		// Iterate over set
//		for(String element: set){
//			System.out.println(element);
//		}
		
		// Does set contain given item
		if(set.contains("snake")){
			System.out.println("Contains snake");
		}
		else{
			System.out.println("Doesn`t contain snake");
		}
		
		Set<String> set1 = new HashSet<String>();
		set1.add("snake");
		set1.add("cat");
		set1.add("elephant");
		
		// Intersection
		Set<String> intersection = new HashSet<String>(set);
		intersection.retainAll(set1);
		System.out.println("Intersection: " + intersection);
		
		// Difference
		Set<String> difference = new HashSet<String>(set);
		difference.removeAll(set1);
		System.out.println("Difference: " + difference);
	}
}

