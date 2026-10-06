package com.kodewala.switch_.day21;

/**
 * This class is responsible to find day based on user-input number
 */
public class Driver1 {

	public static void main(String[] args) {
//		creating object because we've to call instance method
		Driver1 driver1 = new Driver1();

//		take the command line argument and supply to the method
		driver1.indentifyDay(Integer.parseInt(args[0]));
	}

//	Identify the day based on number supplied
	public void indentifyDay(int day) {
//		using switch statement
		switch (day) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("TH");
			break;
		case 5:
			System.out.println("FRY");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 7:
			System.out.println("SUN");
		default:
			System.err.println("INVALID INPUT. PLEASE ENTER NUMBER WITHIN 1 TO 7");
			break;
		}
	}
}
