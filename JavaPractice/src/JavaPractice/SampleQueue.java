package JavaPractice;
import java.util.LinkedList;
import java.util.Queue;

public class SampleQueue {
	
	 public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();
	        queue.add("Alice");
	        queue.add("Bob");
	        queue.add("Charlie");

	        System.out.println("Front of the queue: " + queue.peek());

	        queue.remove(); // Removes "Alice"
	        System.out.println("Queue after removal: " + queue);
	    }

}
