class DrivingEligibility
{
	static 
	{
		System.out.println("Lets check you are eligible for Driving Liscence or not : ");
	}
	
	public static void main(String args[])
	{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		String eligibilityMessage = age >= 18 && age <= 70 ? 
										"Hey, " + name + " congratulations you're eligible for DL." 
										: "Sorry, " + name + " you're not eligible for DL.";
									
		System.out.println(eligibilityMessage);
	}
}