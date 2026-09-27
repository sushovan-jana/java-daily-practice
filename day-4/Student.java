class TotalMark
{
	public static void main(String[] args)
	{
		int totalMarks = Integer.parseInt(args[1]) + Integer.parseInt(args[2]) 
						+ Integer.parseInt(args[3]) + Integer.parseInt(args[4]);
						
		System.out.println("Let's calculate the total marks of " + args[0]);
		System.out.println("We're calculating 4 subjects total marks => ");
		System.out.println("Total Marks : " + totalMarks);
	}
}

class AvgMark
{
	public static void main(String[] args)
	{
		double totalMarks = 0;
		for (int i = 1; i < args.length; i++)
		{
			totalMarks += Integer.parseInt(args[i]);
		}
		
		double avgMark = totalMarks / args.length;
		System.out.println("Average Mark of " + args[0] + " is " + avgMark);
	}
	
}