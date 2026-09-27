class ByteArithmeticQ1
{
	public static void main(String args[])
	{
		byte a = 101;
		byte b = 2;
		var result = a + b; // The type of result is (int)
// 		During compilation a and b is converted into int, and 
//		in case of var, java at first sees the value then decides the type		
		System.out.println(result); // 103
	}
}