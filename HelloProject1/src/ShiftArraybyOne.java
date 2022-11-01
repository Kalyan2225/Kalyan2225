
public class ShiftArraybyOne {
	public static void main(String args[]) {
		int a[] = { 9, 14, 24, 11, 20, 12 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = temp;
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
