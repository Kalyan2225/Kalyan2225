package Exception;

import java.io.IOException;

public class Wrapper
{
	public static void main(String a[]) throws IOException
	{
		int no = 11;

		Integer iobj = new Integer(11);

		int i = iobj; // Unboxing

		Integer iobj2 = no; // Boxing (primitive convert to wrapper)

		System.out.println(no);
		System.out.println(iobj);
		System.out.println(i);
		System.out.println(iobj2);
	}
}