
public class ElementFound {
	public static void main(String[] crr) {
		int a[] = { 90, 20, 50, 60, 70 };
		int num = 30;
		int foundindex = -1;
		{
			for (int i = 0; i < a.length; i++) {
				if (a[i] == num) {
					foundindex = i;
					break;

				}

			}
			if (foundIndex == -1)
				System.out.println("not found");
			else
				System.out.println("Found at index" + foundIndex);
		}

	}

}
