package com.kodewala.oops.Inheritance2;

public class Driver {

	public static void main(String[] args) {

	//	Product product = new Product("Iphone" ,"This is Iphone", 12 ,"In stock" );
	// 	product.viewProductDetails(); 
		
	//	ElectronicProduct  electronic = new ElectronicProduct("Keyboard","This is Keyboard", 10 ,"In stock", true , 5);
	//	electronic.viewElectronicProductDetails();
		
		ClothingProduct clothing = new ClothingProduct("Cotton T-Shirt", "Blue cotton T-shirt",20,"In stock", true, 2, true, 1);
		clothing.viewClothingProductDetails();
	}

}
