import java.util.ArrayList;

public class ArrayListExp1 {
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<>();
		listOfNames.add("Sushovan Jana");
		listOfNames.add("Rajesh Sharma");
		listOfNames.add("Suresh Sir");
		listOfNames.add("Shaharukh Khan");
		listOfNames.add("Amar Ray");
		listOfNames.add("Juliyet Shukla");
		
		System.out.println(listOfNames);

		listOfNames.add(2, "TestName");
		
		listOfNames.remove(4);
		
		listOfNames.add("Shivam Rajput");
		listOfNames.add("Bhuvan Bam");
		
		
		System.out.println(listOfNames);

	}
}
