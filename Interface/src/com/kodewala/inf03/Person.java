package com.kodewala.inf03;

public class Person implements Cloneable  {
	
	String name;
	
	Person(String _name){
		this.name = _name;
	}
    @Override
    public Person clone() throws CloneNotSupportedException {
    	return (Person) super.clone(); // object class clone
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
		
    	Person p = new Person("Kodewala");
    	
    	Person p1 = p.clone(); 
    	
    	System.out.println("P "+ p.name);
    	System.out.println("P1 "+ p1.name);
    	
    	if ( p instanceof Cloneable) {
    		System.out.println("P is type of clonable ");
    	}
    		else
    		{
    			System.out.println("P is not a type of clonable. you can not clone the object of person class ");
    		}
    	}
}

