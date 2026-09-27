class EmailSender
{
	static 
	{
		System.out.println("Delivering your mail, please wait....");
	}

	public static void main(String args[])
	{
		String receiverMail = args[0];
		String message = args[1];
		
		System.out.println(sendEmail(receiverMail, message));
	}
	
	static String sendEmail(String recipient, String message)
	{
		// some business logic...
		return " MAIL HAS BEEN DELIVERED TO " + recipient + " WITH MESSAGE -> " + message;
	}
}