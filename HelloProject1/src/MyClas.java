
public class MyClas
{
	public static void main(String[] args)
	{
		// cs.95

		int val = 1235;

		int r1 = 0, r2 = 0;

		while (val > 0)
		{
			r1 = val % 10;
			val = val / 10;
			r2 = r2 * 10 + r1;
		}
		System.out.println(r2);

	}
	// EndOfMainMethod
}
