package ArraypracticePL;

public class ReverseArrayusingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 5, 7, 9 };
		int i = 0;
		int j = a.length - 1;
		loopI(i, j, a);
		loopK(0, a);
	}

	private static void loopI(int i, int j, int a[]) {
		if (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
			loopI(i, j, a);
		}

	}

	private static void loopK(int k, int[] a) {

		if (k < a.length) {
			System.out.print(a[k] + " ");
			k++;
			loopK(k, a);
		}

	}
}

/*
 * while (i < j) { int temp = a[i]; a[i] = a[j]; a[j] = temp; i++; j--; } for
 * (int k = 0; k < a.length; k++) { System.out.print(a[k] + " ");
 * 
 * }
 * 
 * }
 * 
 * }
 */