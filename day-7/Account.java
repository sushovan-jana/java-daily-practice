class Account
{
	int balance = 100; // instance variable
	static int intRate = 5; // static variable
	
	public static void main(String args[])
	{
		// Creating an object of Account class
		Account acc = new Account();
		
		System.out.println(" Balance is : " + acc.balance); // dot (.) operator
		System.out.println(" Interest rate is : " + Account.intRate); // dot (.) operator
		Account.doSomething(); // calling doSomething() which is static 
		acc.doNothing(); // calling doNothing() which is non-static 
	}
	
	public static void doSomething()
	{
		System.out.println("This is for doing something...");
	}
	
	public void doNothing()
	{
		System.out.println("This is for doing nothing...");
	}
}