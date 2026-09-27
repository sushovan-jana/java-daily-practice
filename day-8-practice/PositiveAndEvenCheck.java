class PositiveAndEvenCheck
{
	static
	{
		System.out.println("Let's check your number is positive and even or not : ");
	}
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		String message = number >= 0 && number % 2 == 0 ? 
							number + " is both even and positive" 
							: number + " is not both positive and even";
		System.out.println(message);
	}
}