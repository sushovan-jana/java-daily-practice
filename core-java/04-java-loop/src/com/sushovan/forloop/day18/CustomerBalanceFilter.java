package com.sushovan.forloop.day18;

public class CustomerBalanceFilter {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Sushovan", 1500, "9876543210");
		Customer customer2 = new Customer("Rahul", 3500, "9123456780");
		Customer customer3 = new Customer("Priyansh", 1800, "9988776655");
		Customer customer4 = new Customer("Arjun", 5200, "9012345678");
		Customer customer5 = new Customer("Snehashish", 900, "9345678901");
		Customer customer6 = new Customer("Vikram", 2100, "8765432109");
		Customer customer7 = new Customer("Ananya", 1250, "9654321870");
		Customer customer8 = new Customer("Rohit", 7800, "8899776655");
		
		Customer[] customerArray = new Customer[8]; // this array will hold customer objects
//		storing customer objects in array of type Customer
		customerArray[0] = customer1;
		customerArray[1] = customer2;
		customerArray[2] = customer3;
		customerArray[3] = customer4;
		customerArray[4] = customer5;
		customerArray[5] = customer6;
		customerArray[6] = customer7;
		customerArray[7] = customer8;
		
//		retrieving cutomers whose balance is less than 2000 using for loop
		for(int i = 0; i < customerArray.length; i++) {
			if(customerArray[i].balance < 2000) {
				System.out.println(customerArray[i].customerName + 
						" your balance is below 2000, please add more money");
			}
		}
//		retrieving customers whose balance is less than 2000 using for-each loop
		for(Customer customer : customerArray) {
			if(customer.balance < 2000) {
				System.out.println(customer.customerName + 
						" your account balance is below 2000, please add more money");
			}
		}
	}

}
