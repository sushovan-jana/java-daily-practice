package com.kodewala.interf_day37.part01;

public class Booking {
    // Hardcoded fields initialized with test values
    private String bookingId = "BK-9942";
    private String customerName = "John Doe";
    private int numberOfGuests = 2;
    private double totalAmount = 150.50;
    
    public Booking() {
    	
	}
    
    public Booking(String bookingId, String customerName, int numberOfGuests, double totalAmount) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.numberOfGuests = numberOfGuests;
		this.totalAmount = totalAmount;
	}

	// Getter for bookingId
    public String getBookingId() {
        return bookingId;
    }

    // Setter for bookingId
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Setter for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for numberOfGuests
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    // Setter for numberOfGuests
    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    // Getter for totalAmount
    public double getTotalAmount() {
        return totalAmount;
    }

    // Setter for totalAmount
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
