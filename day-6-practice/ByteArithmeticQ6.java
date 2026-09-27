class ByteArithmeticQ6
{
	public static void main(String args[])
	{
		byte num1 = 20;
		byte num2 = 40;
		
		byte result1 = (byte)(num1 + num2);
		
//		byte result2 = (byte)num1 + (byte)num2; // It will not compile :  
		//				incompatible types: possible lossy conversion from int to byte
//		System.out.println(result2);
		
		byte num3 = -128;
		num3--;
		System.out.println(num3); // 127
		
// 		byte overflow tricks : if result is greater than 127 , then subtract from 256
//								if result is less than -128, then add with 256		
	}
}