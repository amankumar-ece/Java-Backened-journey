package com.kodewala.oops.method.overridePractice;

 
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Barking");
	}
}

class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("Meow");
	}
}
public class Animal{
	public void makeSound() {
		System.out.println("Making animal sound");
		
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
		Cat c = new Cat();
		c.makeSound();
}
 }
	

