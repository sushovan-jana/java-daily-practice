class StudentInformation
{
	public static void main(String[] args)
	{
		byte firstNumber = 32;
		byte secondNumber = 23;
//		byte totalNumber = (byte)firstNumber + (byte)secondNumber;
		byte totalNumber = (byte) (firstNumber + secondNumber);
		var totalNumber2 = firstNumber + secondNumber;
		System.out.println(totalNumber2);
		
		byte result = 10 + 20;
		System.out.println(result);
	}
}