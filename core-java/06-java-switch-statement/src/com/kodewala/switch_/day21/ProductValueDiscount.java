package com.kodewala.switch_.day21;

/**
 * This class is responsible to caculate discount based on customer type
 */
public class ProductValueDiscount {
//	max discount
	static final int maxDiscount = 2500;

	public static void main(String[] args) {
//		creating object to call instance method
		ProductValueDiscount discount = new ProductValueDiscount();
//		customer type taking from command line
		String customerType = args[0];
		int purchaseAmount = Integer.parseInt(args[1]);

		discount.calculateDiscount(customerType, purchaseAmount);

	}

	public void calculateDiscount(String customerType, int purchaseAmount) {
//		temporary variable to hold discount
		int discount = 0;

		if (purchaseAmount > 1000) {

			switch (customerType.toLowerCase()) {
			case "gold":
				System.out.println("Customer type is gold, applying 20% discount");
				discount = (int) (purchaseAmount - 0.2);
				break;
			case "silver":
				System.out.println("Customer type is silver, applying 10% discount");
				discount = (int) (purchaseAmount - 0.1);
				break;
			case "regular":
				System.out.println("Customer type is regular, applying 5% discount");
				discount = (int) (purchaseAmount - 0.05);
				break;
			default:
				System.err.println("Something went wrong...");
				break;
			}
		} else {
			System.out.println("Please purchase more to have discount");
			return;
		}

		if (discount > maxDiscount) {
			System.out.println("Max discount applied of rs : " + 2500);
			discount = 2500;
		} else {
			System.out.println("Discount applied of rs : " + discount);
		}

		System.out.println("Final amount : " + (purchaseAmount - discount));
	}
}
