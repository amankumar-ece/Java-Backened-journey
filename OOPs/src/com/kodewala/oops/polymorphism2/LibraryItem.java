package com.kodewala.oops.polymorphism2;

public class LibraryItem {
	
	public void displayDetails()
	{
		System.out.println("Details:");
	}

}

class Book extends LibraryItem
{
	public void readBook()
	{
		System.out.println("Book Details");
	}
}

class Magazine
{
	public void viewMagazineIssue()
	{
		System.out.println("Magazine Details");
	}
}

class LibraryView
{
	public static void main(String[] args) {
		
		LibraryItem library = new Book();
		
		Book book = (Book) library;
		book.readBook();
	}
}