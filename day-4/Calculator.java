class MiniCalculator
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		
		switch (args[1])
		{
			case "+" -> System.out.println("Addition result is : " + (num1 + num2));
			case "-" -> System.out.println("Subtraction result is : " + (num1 - num2));
			case "*" -> System.out.println("Multiplication result is : " + (num1 * num2));
			case "/" -> System.out.println("Division result is : " + (num1 / num2));
			case "%" -> System.out.println("Modulo result is : " + (num1 % num2));
			default -> System.out.println("Invalid syntax");
		}
	}
}