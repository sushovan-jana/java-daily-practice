class RapidoRide
{
	static String appName = "RAPIDO";
	static String status;
	
	String riderName;
	int riderId;
	long contact;
	float rating;
	
	static
	{
		status = "ONLINE";
		System.out.println("Starting the " + appName + " application.....");
		System.out.println("Rider status is : " + status);
		System.out.println("------Happy Journey------");
	}
	
	{
		System.out.println("Preperaing your journey....");
	}
	
	public static void main(String args[])
	{
		RapidoRide rr1 = new RapidoRide();
		rr1.riderName = "Sushovan";
		rr1.riderId = 5561;
		rr1.contact = 9689632458L;
		rr1.rating = 4.1f;
		
		System.out.println("Your ride has been booked. Rider Informations are given below -> ");
		System.out.println("Rider name : " + rr1.riderName 
							+ " || Id : " + rr1.riderId
							+ " || contact : " + rr1.contact
							+ " || Rating" + rr1.rating);
	}
	
}