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
// Student is a type. For every loaded type only one Class object will be created. Even though we're using classmulitple times in our program..
class Test
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Class c1 = s1.getClass();
		
		Student s2 = new Student();
		Class c2 = s2.getClass();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
	}
}