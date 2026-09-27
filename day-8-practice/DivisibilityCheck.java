class DivisibilityCheck
{
	public static void main(String args[])
	{
		int userInput = Integer.parseInt(args[0]);
		boolean result = (userInput % 3 == 0) && (userInput % 5 == 0) ? true : false;
		System.out.println(result ? "User input divisible by both 3 and 5" : " Not divisible by both");
	}
}