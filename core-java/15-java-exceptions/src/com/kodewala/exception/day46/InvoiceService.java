package com.kodewala.exception.day46;

public class InvoiceService {
	
	public void generateInvoice() {
		
		/**
		 * Get customers and order details from database
		 * [Connect with db --> create db connections]
		 * + 
		 * [Get details from db]
		 */
		try {
			connectDatabase(); // creating connection
			String name = "Abnormal";
			int lastIndexOf = name.lastIndexOf('a');
			System.out.println(name + " == " + lastIndexOf);

			System.out.println(" Generating an invoice");
			closeConnectionDb();
		} catch (Exception e) {
			
			System.out.println(" Some exception");
			e.printStackTrace();
		} finally { // mandatory executable block... 
			System.out.println(" I am inside finally block...");
		}
		
	}
	
	/**
	 * Connection object
	 */
	private void connectDatabase() {
		System.out.println(" Connecting to DB");

	}
	
	/**
	 * Close connection
	 */
	private void closeConnectionDb() {
		System.out.println(" Close Connection");
	}
}
