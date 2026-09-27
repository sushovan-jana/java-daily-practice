class NumberInRange
{
	static
	{
		System.out.println("Let's check your number is in range of 10 - 50 or not : ");
	}
	
	public static void main(String args[])
	{
		int number = Integer.parseInt(args[0]);
		String message = number >= 10 && number <= 50 ? 
							number + " is within range." 
							: number + " is not within range.";
		System.out.println(message);
	}
}