class DataTypes
{
	public static void main(String args[])
	{
//		The code will not compile for amount range =>  
//		byte amount = -200; // Range is : -128 to 127
//		System.out.println("Learning data type : " + amount); // incompatible types: possible lossy conversion from int to byte
		byte amount = 127;
//		amount++; //the value will be -128
		System.out.println("Learning data type : " + amount);
	}
}

class DefaultValuesOfTypes
{
	static byte age;
	static short bonus;
	static int amount;
	static long totalAmount;
	static float temperature;
	static double uniqueValue;
	static boolean isValid;
	int count;
	
	public static void main(String args[])
	{
		System.out.println("Default values of data-types : ");
		System.out.println("byte -> " + age);
		System.out.println("short -> " + bonus);
		System.out.println("int -> " + amount);
		System.out.println("long -> " + totalAmount);
		System.out.println("float -> " + temperature);
		System.out.println("double -> " + uniqueValue);
		System.out.println("boolean -> " + isValid);
		
//		System.out.println(count); // Compile time error : non-static variable can't be referenced from static context.
	}
	
}