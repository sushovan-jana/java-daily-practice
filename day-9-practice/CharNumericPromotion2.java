class CharNumericPromotion2
{
	public static void main(String args[])
	{
		char ch1 = 'A';
		convertCharToInt(ch1 + 1.5f);
	}
	
	static void convertCharToInt(int tempChar)
	{
		System.out.println(tempChar);
	}
	
	static void convertCharToInt(float tempChar)
	{
		System.out.println(tempChar);
	}
}