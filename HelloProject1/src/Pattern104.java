
public class Pattern104 {
	public static void main(String crr[]) {
		int irange = 5;
		int jrange = 5;
		myCode(irange, jrange);

	}

	public static void myCode(int irange, int jrange) {

		for (int i = 0; i < irange; i++) {
			for (int j = 0; j < jrange; j++) {
				if (j - i == 0 || j + i == 4 || j + i == 2 || j + i == 6) {
					System.out.print("1");

				} else {

					System.out.print("0");
				}

			}
			System.out.println();
		}
	}
}
