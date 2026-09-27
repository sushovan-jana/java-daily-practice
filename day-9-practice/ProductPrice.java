class ProductPrice
{
	static int productPriceThreshold = 3000;
	
	public static void main(String args[])
	{
		String productName = args[0];
		int productPrice = Integer.parseInt(args[1]);
		
		double finalPrice = calculatePrice(productPrice);
		System.out.println(finalPrice > productPrice ? " YOUR " + productName + "`s PRICE IS MORE THAN " 
										+ productPriceThreshold + " ADDITIONAL CHARGE HAS BEEN ADDED. FINAL PRICE IS " + finalPrice
										: " YOUR " + productName + "`s PRICE IS " + finalPrice);
	}
	
	static double calculatePrice(int productPrice)
	{
		double finalPrice = productPrice > productPriceThreshold ? (productPrice + (productPrice * 0.4)) : productPrice;
		return finalPrice;
	}
}