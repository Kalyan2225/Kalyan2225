public class MyClass
{
	public static void main(String[] args)
	{
		// excep.18
		try
		{
			int i = 21 / 0;
			System.out.println(i);
		} catch (Exception e)
		{
			System.out.println("exception occure");
		}

		System.out.println("Rest of the code......");

	}
}
