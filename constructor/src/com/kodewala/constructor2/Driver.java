package com.kodewala.constructor2;

class Invoice extends Object {

	static int gst = 18;
	int amount;
	String itemName;
	String BillingAddress;
	String customerId;
	String customerName;

	Invoice(int _amount, String _itemName, String _BillingAddress, String _customerId, String _customerName) {
		
			this.amount = _amount;
			this.itemName = _itemName;
			this.BillingAddress = _BillingAddress;
			this.customerId = _customerId;
			this.customerName = _customerName;

		}

}

	public class Driver {

		public static void main(String[] args) {
			Invoice inv = new Invoice(18000, "Iphone 18 ", "Kodewala BTM 2nd Stage", " A245", "Kodewala");

			Invoice inv1 = new Invoice(5000, "oppo Enco Buds ", "BTM 1st Stage", " B212", "Aman");
			
			System.out.println("first Invoice :"+ inv.amount+" , "+inv.customerId+" , "+inv.gst);
			System.out.println("Second Invoice :"+ inv1.amount+" ,"+inv1.customerId+" , "+inv.gst);
			
		}
	}

