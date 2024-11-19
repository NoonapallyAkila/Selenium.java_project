package JavaPractice;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
        Hashtable<String, String> countries = new Hashtable<>();
        countries.put("India", "New Delhi");
        countries.put("USA", "Washington DC");

        if (countries.containsKey("India")) {
            System.out.println("Capital of India: " + countries.get("India"));
        }

        if (countries.containsValue("Washington DC")) {
            System.out.println("A country has Washington DC as its capital.");
        }
    }
}
