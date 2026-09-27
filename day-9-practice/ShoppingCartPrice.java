class ShoppingCartPrice
{
	public static void main(String args[])
	{
		int priceArr[] = new int[args.length];
		byte arrIndex = 0;
		
		for (String p : args)
		{
			priceArr[arrIndex] = Integer.parseInt(p);
			arrIndex++;
		}
		
		int totalPrice = totalPrice(priceArr);
		
		System.out.println(" Total price of your shopping cart is : " + totalPrice);
	}
	
	static int totalPrice(int... prices)
	{
		int totalPrice = 0;
		for (int sp : prices)
		{
			totalPrice += sp;
		}
		
		return totalPrice;
	}
}