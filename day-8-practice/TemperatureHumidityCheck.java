
import java.util.Scanner;

class TemperatureHumidityCheck
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		// Keeping track of the current day and how many days satisfy our condition
		int dayCount = 1;
		int validDayCount = 0;

		// Command-line arguments will contain the temperature values
		int arr[] = new int[args.length];

		for (int i = 0; i < arr.length; i++)
		{
			// Converting each temperature from String to int
			arr[i] = Integer.parseInt(args[i]);
		}

		System.out.println("We are moving forward, humidity you have to enter in % -> ");

		for (int t : arr)
		{
			System.out.println("Enter humidity for day-" + dayCount++);

			// Humidity is taken from the user for each temperature value
			int humidity = input.nextInt();

			// A day is valid only when temperature is above 30
			// and humidity is below 50%
			if (t > 30 && humidity < 50) 
				validDayCount++;
			else 
				continue;
		}

		System.out.println("From your data, " +
                   "total day count when temperature was above 30 degree " +
                   "and humidity was below 50% is : " + validDayCount);
	}
}

