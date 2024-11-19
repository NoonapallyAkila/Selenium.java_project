package Test;

public class Car {
	
	String name,color,model;
	double price;
	int capacity;
	public Car(String name,String color)
	{
	this.name=name;
	this.color=color;
	}
	public Car(String name,String color,double price)
	{
	this.name=name;
	this.color=color;
	this.price=price;
	}
	public Car(String name,String color,double price,int capacity,String
	model)
	{
	this.name=name;
	this.color=color;
	this.price=price;
	this.capacity=capacity;
	this.model=model;
	}
	public static void main (String args[])
	{
	Car c1=new Car("Audi","Black");
	System.out.println("Car :"+c1.name+" Color :"+c1.color);
	
	Car c2=new Car("Benz","Black",6000000.25);
	System.out.println("Car :"+c2.name+" Color :"+c2.color+"Price :"+c2.price);
	
	Car c3=new Car("Jeep","Red",7800000.25,2,"A‐class");
	System.out.println("Car :"+c3.name+" Color :"+c3.color+"Price :"+c3.price+" Capacity :"+c3.capacity+" Model :"+c3.model);
	}}
	


