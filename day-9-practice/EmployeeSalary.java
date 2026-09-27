class EmployeeSalary
{
	public static void main(String args[])
	{
		String employeeName = args[0];
		int salaryPerMonth = Integer.parseInt(args[1]);
		
		int annualSalary = calculateAnnualSalary(salaryPerMonth);
		
		System.out.println(" HEY, " + employeeName + ", YOUR ANNUAL SALARY IS : " + annualSalary);
	}
	
	static int calculateAnnualSalary(int salaryPerMonth)
	{
		return 12 * salaryPerMonth;
	}
}