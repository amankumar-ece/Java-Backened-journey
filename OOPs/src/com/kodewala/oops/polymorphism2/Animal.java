package com.kodewala.oops.polymorphism2;

public class Animal {
	public void makeSound()
	{
		System.out.println("Animal Sound ()");
	}

}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog Sound......()");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat sound.....()");
	}
}

class Sound
{
	public static void main(String[] args) {
		
		Animal animal = new Dog(); // Upcasting 
		
        animal.makeSound();		
		
	}
}
