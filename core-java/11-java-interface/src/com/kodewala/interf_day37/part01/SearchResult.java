package com.kodewala.interf_day37.part01;

public class SearchResult {
    // Hardcoded fields initialized with test values for experiment purposes
    private String resultId = "SR-101";
    private String hotelName = "Grand Plaza Resort";
    private double pricePerNight = 120.00;
    private boolean isAvailable = true;

    public SearchResult() {
    	
	}
    
    public SearchResult(String resultId, String hotelName, double pricePerNight, boolean isAvailable) {
		super();
		this.resultId = resultId;
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.isAvailable = isAvailable;
	}

	// Getter for resultId
    public String getResultId() {
        return resultId;
    }

    // Setter for resultId
    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    // Getter for hotelName
    public String getHotelName() {
        return hotelName;
    }

    // Setter for hotelName
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    // Getter for pricePerNight
    public double getPricePerNight() {
        return pricePerNight;
    }

    // Setter for pricePerNight
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    // Getter for isAvailable
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for isAvailable
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}