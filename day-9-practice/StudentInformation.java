class StudentInformation
{
	static String schoolName = "XYZ-SCHOOL";
	
	public static void main(String args[])
	{
		String studentName = args[0];
		
		welcome(studentName);
	}
	
	static void welcome(String name)
	{
		System.out.println(" HEY, " + name + " WELCOME TO " + schoolName);
	}
}