class UnaryOperator
{
	public static void main(String args[])
	{
		int firstNumber = 4;
		int decreasedFirstNumber = --firstNumber;
		
		int secondNumber = 5;
		int decreasedSecondNumber = secondNumber--;
		System.out.println(decreasedFirstNumber);
		System.out.println(decreasedSecondNumber);
		
		System.out.println(secondNumber);
		
		int tempNum = 15;
		--tempNum;
		System.out.println(tempNum);
		
		// bitwise complement operator
		int thirdNumber = 6;
		int bitwisedThirdNumber = ~6;
		System.out.println(bitwisedThirdNumber); // -7
	}
}