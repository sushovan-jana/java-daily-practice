class PlaceOrder
{
	static 
	{
		System.out.println("Processing your order....");
	}

	public static void main(String args[])
	{
		String userName = args[0];
		String productTotalAmount = args[1];
		String address = args[2];
		
		selectAddress(userName, productTotalAmount, address);
	}
	
	static void selectAddress(String userName, String productTotalAmount, String address)
	{
		// some business logic...
		System.out.println("Hey, " + userName + " your address has been saved, product will be delivered in " + address);
		
		makePayment(userName, productTotalAmount);
	}
	
	static void makePayment(String userName, String productTotalAmount)
	{	
		System.out.println(userName + " please, make your payment. Total amount is " + productTotalAmount);
		
		// some business logic...
		System.out.println("payment is done");
		
		placeOrder(userName);
	}
	
	static void placeOrder(String userName)
	{
		System.out.println("Congratulations, " + userName + " your order has been placed successfully.");
	}
}