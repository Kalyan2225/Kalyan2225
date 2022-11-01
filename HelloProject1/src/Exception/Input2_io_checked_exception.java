package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input2_io_checked_exception
{
	public static void main(String arg[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		try
		{
			System.out.println("Enter your name");
			String name = bobj.readLine();
			System.out.println("Your name is : " + name);

			System.out.println("Enter your age");
			int age = Integer.parseInt(bobj.readLine());
			System.out.println("Your age is : " + age);
		} catch (IOException obj)
		{
			System.out.println("Exception occurs ");
		} finally
		{
			iobj = null; // null is keyword which release resources or free object and garbage collector
							// free memory
			bobj = null;
		}
	}
}
