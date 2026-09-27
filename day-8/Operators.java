class Operators
{
	public static void main(String args[])
	{
		
		int minAge = 18; // Assignment operator
		
		int userAge = Integer.parseInt(args[1]); // If we're giving age as "22years or 22nd", we'll get NumberFormatException
		String userName = args[0];
		
		System.out.println(" Applying DL for : " + userName);
		System.out.println(" Allowed to apply for DL : " + (minAge < userAge));
		
		String message = minAge < userAge ? "Allowed" : "Not allowed";
		System.out.println(message);
		
	}
}