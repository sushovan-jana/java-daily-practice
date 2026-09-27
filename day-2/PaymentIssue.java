class PaymentIssue // When one class is declared as public then the file name will also be the same name.
{							// Until the code is not compiling no bytecode will be generated.
							// NOTE : If I have some mistake in any of the class, the bytecode of remaining class's will not be generated.
	public static void main(String[] a)
	{
		System.out.println("I've done the payment!");
	}
}

class LatePay
{
	public static void main(String[] a) 
	{
		System.out.println("I can't make payment now!");
	}
}

class FullPay
{
	/*public static void main(String[] a)   // If a class doesn't contain main() method then 
											// We will get one error saying : 
											// Main method not found in class FullPay, please define the main method as:
											// public static void main(String[] args)
											// or a JavaFX application class must extend javafx.application.Application
	{
		System.out.println("I've done the full-payment.");
	}*/
	
}