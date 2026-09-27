class FundTransfer
{
	public static void main(String args[])
	{
		System.out.println(" Starting main()");
		
		// Calling the method and passing the values(input)
		boolean result = FundTransfer.doTransaction(10, "85201798562", "74185278945");
		
		System.out.println(" Is txn successful ? -> " + result);
		System.out.println(" Ending main()");
	}
	
	static boolean doTransaction(int amount, String senderAccNo, String recAccNo)
	{
		System.out.println(" Entered doTransaction()");
		
		System.out.println(" Input informations are given below -> ");
		
		System.out.println(" Amount is - " + amount + " || Sender's account number is - " + senderAccNo + " || Reciver's account number is - " + recAccNo);
		// some biz logic which will perform the transaction...
		
		System.out.println(" Exit doTransaction()");
		return true;
	}
}