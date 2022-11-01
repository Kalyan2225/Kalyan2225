public class MyClass
{
	public static void main(String[] args)
	{
		// obj.7
		start();
	}

	static void start()
	{
		String s1 = "good";
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);
	}

	static String fix(String s1)
	{
		s1 = s1 + "bad";
		System.out.print(s1 + " ");
		return "bad";
	}
}
