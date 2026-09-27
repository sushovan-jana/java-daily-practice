class OrderMgmt
{
	private int orderValue = 1200;
	
	public void placeOrder(String itemName)
	{
		// Using private variable within the same class
		System.out.println(" Order value is : " + orderValue);
		
		System.out.println(" Placing an order for : " + itemName);
	}
}