package JavaPractice;

import java.util.Stack;

public class ExampleStack {
	
	public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }

        stack.push("Hello");
        System.out.println("Stack is empty: " + stack.isEmpty());
    }

}
