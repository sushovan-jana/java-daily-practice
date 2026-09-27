class ByteArithmeticQ7
{
	public static void main(String args[])
	{
		byte a = 45;
		byte b = 56;
		int additionRes = a + b;
		System.out.println(additionRes);
		
		byte data[] = new byte[5];
		System.out.println(data[0]);
//		data[1] = 200;
		data[1] = 50;
		data[2] = 60;
		data[3] = (byte) (data[1] + data[2]);
		System.out.println(data[3]);
	}
}