package pr;

public class FindSecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 9, 8, 10 };
		myCode(a);

	}

	private static void myCode(int[] a) {

		int firstmax = 0;
		int secmax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > firstmax) {

				secmax = firstmax;
				firstmax = a[i];

			}

			if (a[i] > secmax && a[i] != firstmax) {

				secmax = firstmax;
			}

		}
		System.out.println(secmax);
	}

}
