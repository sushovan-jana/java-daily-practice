class Driver 
{
	public static void main(String args[])
	{
		System.out.println(" Starting of Driver.main()");
		
		OrderMgmt objMgmt = new OrderMgmt();
		objMgmt.placeOrder("I phone 18");
		
		System.out.println(" Ending of Driver.main()");
	}
}