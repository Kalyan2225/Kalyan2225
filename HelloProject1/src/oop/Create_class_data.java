package oop;

public class Create_class_data
{
	int rollno;
	String name;
	String city;

	public void topic()
	{
		System.out.println("Student detail  " + name);
	}

	public void fulldetail()
	{
		System.out.println("Student Roll No: " + rollno);
		System.out.println("Student Name: " + name);
		System.out.println("Student city: " + city);
	}

}

class Student
{
	public static void main(String args[])
	{
		Create_class_data st1;
		st1 = new Create_class_data();
		st1.rollno = 12;
		st1.name = "kalyan";
		st1.city = "pune";

		st1.topic();
		st1.fulldetail();

	}

}
