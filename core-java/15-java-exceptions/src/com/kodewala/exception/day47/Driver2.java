package com.kodewala.exception.day47;

public class Driver2 {
	public static void main(String[] args) {
		PaymentMgmt mgmt = new PaymentMgmt();
		try {
			mgmt.doPayment("74179962", 1200);
		} catch (FundTransferException e) {
			System.out.println(e.getMessage());
		}
	}
}
