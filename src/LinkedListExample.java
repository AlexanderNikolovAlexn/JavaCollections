import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings(CollectionNames.ARRAYLIST.getName(), arrayList);
		doTimings(CollectionNames.LINKEDLIST.getName(), linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long startTime = System.currentTimeMillis();

//		// Add items at the end of the list
//		for (int i = 0; i < 1E5; i++) {
//			list.add(i);
//		}

		// Add items elsewhere in the list
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Time taken: " + (endTime - startTime) + " ms for "
				+ type);
	}

}
