class TransactionCharge
{
	static
	{
		System.out.println("We're calculating your transaction amount - ");
	}
	
	public static void main(String args[])
	{
		String userName = args[0];
		int txnAmount = Integer.parseInt(args[1]);
		
		int extraChargeThreshold = 2000;
		int txnTotalAmount = txnAmount > extraChargeThreshold ? 
									(int)(txnAmount + (txnAmount * 0.03)) : txnAmount;
		
		String message = txnTotalAmount > 2000 ? 
				"Hey " + userName + 
				" your amount is greater than " 
				+ extraChargeThreshold 
				+ " & 3% additional charge has been added" + 
				" and your total amount is " + txnTotalAmount
				: "Hey " + userName + " No additional charge for this transaction";
		System.out.println(message);		
	}
}