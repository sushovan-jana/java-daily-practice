class EmployeeInformation
{
	static String companyName;
	byte age;
	short experience;
	int salary;
	long phoneNumber;
	float height;
	double performanceRating;
	
	public static void main(String args[])
	{
		System.out.println(companyName); // Default value is : null
//		System.out.println(age); // compile time error : non-static variable age cannot be referenced from a static context
// 		It means we can't directly access a non static variable in a static context but we can access via object.

		EmployeeInformation e = new EmployeeInformation();
		e.age = 23;
		System.out.println(e.age);
		
		System.out.println(e.experience);
		System.out.println(e.salary);
		System.out.println(e.phoneNumber);
		System.out.println(e.height);
		System.out.println(e.performanceRating);
		
//		static int temp = 54; // Compile time error: illegal start of expression -> we can't declare
		
		byte num = 127;
		num++;
		System.out.println(num); // -128
	}
}

