package Exception;

import java.util.Scanner;

class AgeInvalid extends Exception // saglyancha group aahe exception
{
	public AgeInvalid(String str)
	{
		super(str);
	}
}

class ExceptionM6
{
	public static void main(String a[])
	{

		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sobj.nextInt();
		try
		{
			if (age < 18)
			{
				throw new AgeInvalid("Age is below 18"); // create user define exception
			}
		} catch (AgeInvalid obj)
		{
			System.out.println("Inside catch");
			System.out.println(obj);
		}
	}
}
