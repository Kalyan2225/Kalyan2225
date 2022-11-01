
public class Pattern71 {
	public static void main(String crr[]) {
		int irange = 9;
		int jrange = 9;
		myCode(irange, jrange);

	}

	public static void myCode(int irange, int jrange) {
		for (int i = 0; i < irange; i = i + 2) {
			char cnt = 'A';

			for (int j = 0; j < jrange; j++) {

				if (j - i <= 0) {

					System.out.print(cnt);
					if (j < i / 2)
						cnt++;
					else
						cnt--;
				}

				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
