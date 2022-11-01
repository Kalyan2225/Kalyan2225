
public class Pattern106 {
	public static void main(String crr[]) {
		int irange = 9;
		int jrange = 9;
		myCode(irange, jrange);

	}

	public static void myCode(int irange, int jrange) {

		for (int i = 0; i < irange; i++) {
			int cnt = 1;
			for (int j = 0; j < jrange; j++) {
				if (j + i >= 8) {
					System.out.print(cnt++ + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
