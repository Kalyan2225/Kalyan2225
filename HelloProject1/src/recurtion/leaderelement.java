package recurtion;

public class leaderelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 14, 6, 11 };
		int i = 0;
		loopi(i, a);
	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			int cnt = 0;
			int j = i + 1;
			loopj(i, j, a, cnt);
			i++;
			loopi(i, a);

		}

	}

	private static void loopj(int i, int j, int[] a, int cnt) {
		if (j < a.length) {
			if (a[i] < a[j]) {
				cnt++;

			}

		}

	}

}
