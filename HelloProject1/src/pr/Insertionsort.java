package pr;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 3, 56, 2, 6, 54, 9 };
		myCode(a);

	}

	private static void myCode(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			int j = i - 1;
			{
				if (a[i] < a[j]) {

					j = j - 1;
				}
			}

		}

	}

}
