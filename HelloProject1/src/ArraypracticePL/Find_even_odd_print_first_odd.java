package ArraypracticePL;

public class Find_even_odd_print_first_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 14, 12, 17, 55, 73 };

		int b[] = new int[a.length];
		int index = 0;
		loopK(0, a, b, index);
		loopJ(0, b);
	}

	private static void loopK(int k, int[] a, int[] b, int index) {
		if (k < a.length) {
			if (a[k] % 2 == 0) {
				b[index++] = a[k];

			} else {
				b[index++] = a[k];

			}
			k++;
			loopK(k, a, b, index);
		}
	}

	private static void loopJ(int j, int[] b) {
		if (j < b.length) {
			System.out.print(b[j] + " ");
			j++;
			loopJ(j, b);
		}

	}
}

/