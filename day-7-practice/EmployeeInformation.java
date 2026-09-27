class EmployeeInformation
{
	static String companyName = "Amazon";
	int empId;
	String empName;
	int empAge;
	long contact;
	
	static
	{
		System.out.println("Welcome buddy -> ");
	}
	
	{
		System.out.println("Employee Information is below -> ");
	}
	
	public static void main(String args[])
	{
		EmployeeInformation emp1 = new EmployeeInformation();
		emp1.empId = 120021;
//		emp1.empName = "Rakesh Sharma";
		
		System.out.println(emp1.empId + " - " + emp1.empName + " - " + emp1.contact);
	}
}