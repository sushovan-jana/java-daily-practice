class AND_Operator
{
	public static void main(String args[])
	{
		int minAmount = 1000;
		int maxAmount = 2000;
		
		int userTxnAmount = Integer.parseInt(args[1]);
		String userName = args[0];
		
		boolean condition1 = userTxnAmount  <= minAmount;
		boolean condition2 = userTxnAmount <= maxAmount;
		System.out.println(" Condition 1 : " + condition1);
		System.out.println(" Condition 2 : " + condition2);
		
		System.out.println(" Charge will be applicable : " + ((userTxnAmount  >= minAmount) && (userTxnAmount <= maxAmount)));
	}
}