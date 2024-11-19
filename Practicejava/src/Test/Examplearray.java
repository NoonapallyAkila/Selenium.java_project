package Test;

import java.util.Scanner;

public class Examplearray {
	
	
	public static void main(String[] args) { 
		 Scanner s=new Scanner(System.in); 
		 int size; 
		 System.out.println("Enter the size of an array:"); 
		 size=s.nextInt(); 
		 int a[]=new int[size]; 
		 for(int i=0;i<a.length;i++) 
		 { 
		 a[i]=s.nextInt(); 
		 } 
		 int sum=0; 
		 for(int j=0;j<a.length;j++) 
		 { 
		 sum=sum+a[j]; 
		 } 
		 System.out.println("Sun : "+sum); 
		 float average=(float)sum/a.length; 
		 System.out.println("Average : "+average); 
		 s.close();

}}
