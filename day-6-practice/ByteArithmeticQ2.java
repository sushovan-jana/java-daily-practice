class ByteArithmeticQ2
{
	public static void main(String[] args)
	{
		byte a = 32;
		byte b = 65;
		byte result = a + b;
		
		System.out.println(result); //  incompatible types: possible lossy conversion from int to byte
		// During compilation only a and b will be converted into type int, byte can't store that so compiler will show error
	}
}