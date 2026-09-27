class CharacterArithmeticQ1
{
	public static void main(String args[])
	{
		char ch1 = 'A';
		System.out.println(ch1);       // A
		System.out.println(ch1 + 1);   // 66

		ch1++;
		System.out.println(ch1);        // B
		System.out.println((int)ch1);  // 66

		char ch2 = 'b';
		System.out.println(ch1 + ch2);  // 164

		char ch3 = 'C' + 22;
		System.out.println(ch3);        // Y

		char ch4 = 'D';

		char result1 = ch4 + 32;
		//  Compile-time error: possible lossy conversion from int to char

		/*
		Reason:
		When a char variable participates in an arithmetic operation,
		Java applies numeric promotion. The char value is promoted to int,
		so the entire expression (ch4 + 32) becomes an int.

		Therefore, an int result cannot be directly assigned to a char
		variable without an explicit cast.

		We can store the result in an int variable instead:
		*/

		int result2 = ch4 + 32;
		System.out.println((char)result2);  // d
	}
}

