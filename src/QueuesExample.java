import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class QueuesExample {

	public static void main(String[] args) {		
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(8);
		q1.add(1);
		
		try {
			q1.add(3);
		} catch (IllegalStateException e) {
			System.out.println("Too many elements!");
		}
		
		for (Integer val : q1) {
			System.out.println(val);
		}
		
		System.out.println("Removed: " + q1.remove());
		System.out.println("Removed: " + q1.remove());
		System.out.println("Removed: " + q1.remove());
		
		try {
			System.out.println("Removed: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Try to remove more elements than exists!");
		}
		
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		// offer doesn`t throw exception
		q2.offer(10);
		q2.offer(8);
		q2.offer(1);
		
		for (Integer val : q2) {
			System.out.println(val);
		}
		
		System.out.println("Removed: " + q2.poll());
		System.out.println("Removed: " + q2.poll());
		System.out.println("Removed: " + q2.poll());
		
	}

}
