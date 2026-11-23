class ElectricityBill
{
	public static void main(String args[])
	{
		String unit = args[0];
		
		int unitInt = Integer.parseInt(unit);
		
		int result = electricityBill(unitInt);
		
		System.out.println("ElectricityBill : " + result);		
	}
	
     static int electricityBill( int unit)
	 {
		 System.out.println("LOAD UNIT: " + unit);
		 
		 if ( unit < 100)
		 {
			 return unit *2;
		 }
		 else if ( unit < 200)
		 {
			 return unit *3;
		 }
		 else if ( unit < 300)
		 {
			 return unit *5;
		 }
		 else
		 {
			 return unit *7;
		 }
	 }
}
