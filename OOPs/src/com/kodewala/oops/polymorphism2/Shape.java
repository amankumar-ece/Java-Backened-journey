package com.kodewala.oops.polymorphism2;

public class Shape {
	public void calculateArea() 
	{
		System.out.println("Shape of the Area ");
	}

}

class Circle extends Shape
{
	public void calculateArea()
	{
		System.out.println("Circle");
	}
}

class Rectangle extends Shape
{
	public void calculateArea()
	{
		System.out.println("Rectangle ");
	}
}

class Area 
{
	public static void main(String[] args) {
		
		//  for DownCasting we need to first upcasting
		
	//	Shape shape = new Circle(); // upcasting 
		
	 //   Circle circle = (Circle) shape;
	// 	circle.calculateArea();
		
	 	Shape shape = new Rectangle();
	 	
		Rectangle rectangle = (Rectangle) shape;
		rectangle.calculateArea();
	}
}