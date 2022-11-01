package pr;

public class SelectionSort {
	public static void main(String args) {
		int a[] = { 4, 5, 63, 36, 7, 8 };
		myCode(a);
	}

	private static void myCode(int[] a) {
		// TODO Auto-generated method stub

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);

		}

	}

}
