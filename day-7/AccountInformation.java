class AccountInformation
{
	static String status = "active";
	
	public static void main(String args[])
	{
		// Declare variable
		int amount;
		// Initialization
//		amount = 34000;
		
		System.out.println("Account balance : " + amount); //  variable amount might not have been initialized
	}
	
	void transfer()
	{
		int transferAmount = 5000;
		System.out.println("Account status is : " + status);
//		System.out.println("Account balance after transferring money is : " 
//							+ (amount - transferAmount)); //  error: cannot find symbol
	}
}