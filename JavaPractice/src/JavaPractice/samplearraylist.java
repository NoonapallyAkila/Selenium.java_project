package JavaPractice;

import java.util.ArrayList;

public class samplearraylist {
	
	public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Modify an element
        fruits.set(1, "Blueberry"); // Replace "Banana" with "Blueberry"

        // Remove an element
        fruits.remove("Apple");

        System.out.println("Fruits after modification: " + fruits);
    }

}
