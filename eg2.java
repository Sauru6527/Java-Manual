class Student
{
	int roll_number;
	String name;
	float percentage;
	static int count = 0;
	
	Student()  //default Constructor
	{
		roll_number = 0;
		name = null;
		percentage = 0.0f;
	}
	
	Student(int roll_number,String name,float percentage) //parameterised Constructor
	{
		this.roll_number = roll_number;
		this.percentage = percentage;
		this.name = name;
		count++;
	}
	
	static void Display_object_count()
	{
		System.out.println("Object Count ="+count);
	}
	
	void Display()
	{
		System.out.println("Roll Number = "+roll_number);
		System.out.println("NAME = "+name);
		System.out.println("Percentage = "+percentage);
	}
}


class Program
{
	public static void main(String args[])
	{
		Student obj1 = new Student(10,"Ram",65.34f);
		Student obj2 = new Student(11,"LAXIMAN",85.34f);
		Student obj3 = new Student(12,"SITA",95.34f);
		
		obj1.Display();
		obj2.Display();
		obj3.Display();
	}
}
		
		
		