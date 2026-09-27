class CharNumericPromotion
{
	public static void main(String args[])
	{
		convertCharToInt('a');
		char ch = 'b';
		convertCharToInt(ch);
	}
	
	static void convertCharToInt(byte tempChar)
	{
		System.out.println(tempChar);
	}
	
	static void convertCharToInt(int tempChar)
	{
		System.out.println(tempChar);
	}
}