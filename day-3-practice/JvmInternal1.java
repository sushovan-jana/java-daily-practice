import java.lang.reflect.*;
class Student
{
	public String name()
	{
		return "Sushovan";
	}
	
	public int roll()
	{
		return 121;
	}
}
// Student is a type. For every loaded type only one Class object will be created. 
// Even though we're using classmulitple times in our program..
class Test
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		int count = 0;
		// This line may throw exception
		Class c = Class.forName("Student"); // Taking class level information
		Method[] methods = c.getDeclaredMethods(); // Getting the methods declared inside class
		System.out.println("Declared methods are : ");
		for (Method m : methods)
		{
			count++;
			System.out.println(m.getName());
		}
		System.out.println("Total methods counted : " + count);
		
		Student s1 = new Student();
		Class c1 = s1.getClass();
		
		Student s2 = new Student();
		Class c2 = s2.getClass();
		
		System.out.println(c1.hashCode()); // 366712642
		System.out.println(c2.hashCode()); // 366712642
		System.out.println(c1 == c2); // true
	}
}