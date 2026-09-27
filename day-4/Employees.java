class EmployeeDetails
{
	public static void main(String[] args)
	{
		// We should never do hard coding...
		
		/*System.out.println("Sushovan");
		System.out.println("Shovan");
		System.out.println("Rajat");
		*/
		
		// Taking the usernames from command line, the inputs are called command line arguments...
		String emp1 = args[0];
		String emp2 = args[1];
		String emp3 = args[2];
		
		System.out.println(args.length);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}

class EmployeeSalary
{
	public static void main(String[] args) 
	{
		int primarySalary = Integer.parseInt(args[1]);
		int bonus = Integer.parseInt(args[2]);
		System.out.println("So " + args[0] + " your primary salary is " + primarySalary + " and your bonus is " + bonus);
		int totalSalary = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
		System.out.println("Total salary = " + totalSalary);
	}
	
}