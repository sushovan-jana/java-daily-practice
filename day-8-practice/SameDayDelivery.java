class SameDayDelivery
{
	static String userType = "Prime User";
	public static void main(String args[])
	{
		String userName = args[0];
		String userType = args[1];
		
		String result = userType.equalsIgnoreCase(SameDayDelivery.userType) ? 
								userName + " you are eligible for same day delivery" 
								: " Ordered will be delivered tomorrow";
		System.out.println(result);
	}
}