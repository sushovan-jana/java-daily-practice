class TransferMoney
{
	static String bankName = "SBI";
	static int maxAmountThreshold = 20000;
	
	static
	{
		System.out.println(" Processing your payment...");
	}
	
	public static void main(String args[])
	{
		String senderAccNumber = args[0];
		int amount = Integer.parseInt(args[1]);
		String receiverAccNumber = args[2];
		
		System.out.println(transferMoney(amount) ? " Money has been transferred." : " Trasaction failed.");
	}
	
	static boolean transferMoney(int amount)
	{	
		return amount > maxAmountThreshold ? false : true;
	}
}