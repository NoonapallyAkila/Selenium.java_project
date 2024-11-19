package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sampleprogram {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter 5 numbers:");
    for (int i = 0; i < 5; i++) {
        numbers.add(scanner.nextInt());
    }
    
    Collections.sort(numbers, Collections.reverseOrder());
    
    int secondLargest = numbers.get(1);
    
    System.out.println("The second largest number is: " + secondLargest);
    
    scanner.close();

}}
