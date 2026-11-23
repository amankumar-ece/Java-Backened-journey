class DeliveryCharge
{
	public static void main(String args[])
	{
		String delivery = args[0];
		
		int deliveryInt= Integer.parseInt( delivery);
		
		int result = deliveryCharge(deliveryInt);
		
		System.out.println("Delivery Charge: "+ result);
		
	}
	static int deliveryCharge(int delivery)
	{
		System.out.println("Entered Amount: "+ delivery);
		if ( delivery >= 2000)
		{
			return 0;
		}
		else if (delivery >=1000)
		{
			return 50;
		}
		else if (delivery >= 500)
		{
			return 100;
		}
		else 
		{
			return 150;
		}
	}
}
