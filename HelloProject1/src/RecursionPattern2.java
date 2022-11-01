
public class RecursionPattern2 {
	public static void main(String args[]) {
		loopI(0);

	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		while (i < 5) {
			loop(0, i);
			System.out.println();
			i++;

		}
	}

	private static void loopJ(int j, int i) {
		while (j < 5) {
			if (j + i <= 4) {
				System.out.print("*");

			} else {
				System.out.print(" ");

			}
			j++;

		}

	}
}
