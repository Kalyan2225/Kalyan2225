
public class RotateLeftUsingRecursion {
	public static void main(String[] args) {
		int a[] = { 3, 7, 1, 8, 9, 23 };
		int temp = a[0];
		loopI(0, a);
		a[a.length - 1] = temp;
		loopJ(0, a);

	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub

	}

	private static void loopJ(int j, int[] a) {
		if (j < a.length)

		{
			System.out.print(a[j] + " ");
			j++;
			loopJ(j, a);

		}

	}

}
