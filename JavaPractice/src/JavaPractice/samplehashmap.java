package JavaPractice;

import java.util.HashMap;

public class samplehashmap {
	
	 public static void main(String[] args) {
	        HashMap<String, Integer> scores = new HashMap<>();
	        scores.put("Alice", 95);
	        scores.put("Bob", 80);

	        if (scores.containsKey("Alice")) {
	            System.out.println("Alice is in the list.");
	        }

	        if (scores.containsValue(80)) {
	            System.out.println("A score of 80 is present.");
	        }
	    }

}
