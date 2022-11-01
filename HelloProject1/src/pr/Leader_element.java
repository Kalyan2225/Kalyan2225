package pr;

public class Leader_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 15, 9, 13, 4, 7 };
		myCode(a);

	}

	private static void myCode(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int j = i + 1;
			for (; j < a.length; j++) {

				if (a[i] < a[j]) {
					break;

				}
			}
			if (j == a.length) {
				System.out.println(a[i]);

			}

		}
	}

}
