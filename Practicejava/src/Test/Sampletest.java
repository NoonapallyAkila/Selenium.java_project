package Test;

import java.util.Scanner;

public class Sampletest {
	
	int number;
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter an integer: ");
	    int number = scanner.nextInt();
	    
	    int reversedNumber = 0;
	    
	    while (number != 0) {
	        int digit = number % 10;         // Get the last digit
	        reversedNumber = reversedNumber * 10 + digit; // Add digit to the reversed number
	        number /= 10;                    // Remove the last digit from the original number
	    }
	    
	    System.out.println("Reversed number: " + reversedNumber);
	    
	    scanner.close();
	}
	    
	}
	
	
	


