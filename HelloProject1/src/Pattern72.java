
public class Pattern72 {
	public static void main(String crr[]) {
		int irange = 5;
		int jrange = 9;
		myCode(irange, jrange);

	}

	public static void myCode(int irange, int jrange) {
		for (int i = 0; i < irange; i++) {
			int cnt = 1;
			for (int j = 0; j < jrange; j++) {
				if (j + i >= 4 && j - i <= 4) {

					System.out.print(cnt);
					if (j < 4) {
						cnt++;
					} else {
						cnt--;
					}

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
