class ByteArithmeticQ4
{
    public static void main(String[] args)
    {
        byte firstNum = 120;
		byte secondNum = 40;
		byte subRes = (byte)(firstNum + secondNum);
		
		System.out.println(subRes); // -96 : Type casting to byte, that's why value is decreasing .... int type to byte.
    }
}