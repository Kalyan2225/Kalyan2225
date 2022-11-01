public class Pattern77 {
	public static void main(String[] args) {
		int irange = 5;
		int jrange = 5;
		myCode(irange, jrange);
	}

	public static void myCode(int irange, int jrange) {
		int cnt1 = 0;
		for (int i = 0; i < irange; i++) {
			cnt1++;
			int cnt2 = cnt1;
			int diff = 4;

			for (int j = 0; j < jrange; j++) {
				if (j - i <= 0) {
					System.out.print(cnt2 + " ");
					cnt2 = cnt2 + diff;
					diff--;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}