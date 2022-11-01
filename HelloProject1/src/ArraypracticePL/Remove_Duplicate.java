package ArraypracticePL;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 45, 6, 7, 12, 6, 9 };
		int unq = 0;
		unq = loopI(0, a, unq);

		int b[] = new int[unq];
		int index = 0;
		b = loopK(0, a, b, index);

		loopZ(0, b);
	}

	private static void loopZ(int z, int[] b) {
		// TODO Auto-generated method stub
		if (z < b.length) {
			System.out.print(b[z] + " ");
			z++;
			loopZ(z, b);

		}

	}

	private static int[] loopK(int k, int[] a, int[] b, int index) {
		// TODO Auto-generated method stub
		if (k < a.length) {
			int count = 0;
			int l = k - 1;
			count = loopL(l, k, a, count);
			if (count == 0) {
				b[index++] = a[k];
			}
			k++;
			return loopK(k, a, b, index);
		}
		return b;

	}

	private static int loopL(int l, int k, int[] a, int count) {
		// TODO Auto-generated method stub
		if (l >= 0) {
			if (a[k] == a[l]) {

				count++;
			}
			l--;
			return loopL(l, k, a, count);
		}
		return count;

	}

	private static int loopI(int i, int[] a, int unq) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			int dup = 0;
			int j = i - 1;
			dup = loopJ(j, i, a, dup);
			if (dup == 0) {
				unq++;
			}
			i++;
			return loopI(i, a, unq);
		}
		return unq;

	}

	private static int loopJ(int j, int i, int[] a, int dup) {
		// TODO Auto-generated method stub
		if (j >= 0) {
			if (a[i] == a[j]) {
				dup++;
			}
			j--;
			return loopJ(j, i, a, dup);
		}
		return dup;

	}
}

/*
 * int unq = 0; for (int i = 0; i < a.length; i++) { int dup = 0; for (int j = i
 * - 1; j >= 0; j--) { if (a[i] == a[j]) { dup++; } } if (dup == 0) { unq++;
 * 
 * } } int b[] = new int[unq]; int index = 0; for (int i = 0; i < a.length; i++)
 * { int count = 0; for (int j = i - 1; j >= 0; j--) { if (a[i] == a[j]) {
 * count++; }
 * 
 * } if (count == 0) { b[index++] = a[i];
 * 
 * }
 * 
 * } for (int k = 0; k < b.length; k++) { System.out.print(b[k] + " ");
 * 
 * } }
 * 
 * }
 */