package JavaPractice;

import java.util.Scanner;

public class Testsample {
	
public static void main(String [ ]args ) {
	
	Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Enter a string: ");
    
    String input = scanner.nextLine();
    
    
    
    StringBuilder numbersOnly = new StringBuilder();
    
    
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        
        
        if (Character.isDigit(ch)) {
            
            numbersOnly.append(ch);
        }
    }
    
    
    if (numbersOnly.length() > 0) {
        System.out.println("The extracted numbers are: " + numbersOnly.toString());
    } else {
        System.out.println("No numbers found in the input.");
    }
    
    
    scanner.close();
}
}
