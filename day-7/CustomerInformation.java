class CustomerInformation
{
    static String appName = "Blinkit";
    String customerName;
    int customerAge;
    String address;
    long phoneNumber;

    // non-static block
    {
        System.out.println("Doing some operation in non-static block");
    }

    // static block
    static
    {
        System.out.println("Doing some operation in static block");
    }

    public static void main(String args[])
    {   

        CustomerInformation info1 = new CustomerInformation();
        info1.customerAge = 23;
		System.out.println(appName);
    }
}