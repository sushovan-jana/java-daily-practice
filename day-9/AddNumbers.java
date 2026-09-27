class AddNumbers
{
	public static void main(String args[])
	{
		// Taking input from command line...
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		
		// Calling the method...
		int sum = AddNumbers.add(firstNumber, secondNumber);
		
		System.out.println("The addition result for your input is : " + sum);
	}
	
	static int add(int firstNumber, int secondNumber)
	{
		// Calculating the sum
		int sum = firstNumber + secondNumber;
		
		return sum;
	}
}