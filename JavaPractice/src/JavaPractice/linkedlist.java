package JavaPractice;

import java.util.LinkedList;

public class linkedlist {
	
	public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: " + names);

        // Adding elements at specific positions
        names.addFirst("Zara");
        names.addLast("Eve");
        System.out.println("Updated List: " + names);
    }

}
