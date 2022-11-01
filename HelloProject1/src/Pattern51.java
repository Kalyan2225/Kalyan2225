
public class Pattern51 {
	public static void main(String crr[]) {
		int irange = 9;
		int jrange = 5;
		myCode(irange, jrange);

	}

	public static void myCode(int irange, int jrange) {

		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {

				if (j + i >= 4) {
					System.out.print("*");
				}

				else if (j - i >= -4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
