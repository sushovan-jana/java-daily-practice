class FreeDelivery
{
	public static void main(String args[])
	{
		String userName = args[0];
		int purchasedAmount = Integer.parseInt(args[1]);
		
		int freeDeliveryAmount = 500;
		
		String status = (freeDeliveryAmount < purchasedAmount) ? 
											"Congratulations " + userName + " you claimed free delivery" 
											: "Add more items to get free delivery";
		System.out.println(status);
	}
}