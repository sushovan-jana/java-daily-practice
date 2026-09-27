class OrderDetails
{
	public static void main(String[] args)
	{
//		While we have multiple spaces in an input we can use "" 
//		inside that if we write something then it will behave like one word

		System.out.println("Order was placed, the order details are below => ");
		System.out.println("ORDER ID - " + args[0]);
		System.out.println("ORDER PLACED BY - " + args[1]);
		System.out.println("ADDRESS - " + args[2]);
	}
}
