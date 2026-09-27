class DeliveredProductInformation
{
	static String status = "DELIVERED";
	
	int productId;
	String productName;
	int totalAmount;
	int soldAmount;
	int prise;
	
	static
	{
		// System.out.println("  Total amount : " + totalAmount); // Compile time error
		// From a static block we can't access a non-static variable
	}
	
	{
		System.out.println(" The prise of product is " + prise + " The status is " + status); 
		// From non-static block we can assess anything.
	}
	
	public static void main(String args[])
	{
		DeliveredProductInformation dpi1 = new DeliveredProductInformation();
		dpi1.productId = 3201;
		dpi1.productName = "Asus-zenbook";
		dpi1.totalAmount = 20;
		dpi1.soldAmount = 14;
		dpi1.prise = 127000;
		
		System.out.println(" TOTAL " + dpi1.productName + " LAPTOPS HAS BEEN SOLD.");
		System.out.println(dpi1.productName + " EACH LAPTOP PRIZE IS - " + dpi1.prise + " INR.");
		System.out.println(" AVAILABLE LAPTOP IS " + (dpi1.totalAmount - dpi1.soldAmount));
	}
	
}