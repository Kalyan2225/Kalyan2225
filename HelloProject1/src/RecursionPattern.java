
public class RecursionPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopI(0);
	}

	private static void loopI(int i) {
		while (i < 5) {
			loopJ(0, 1);
			System.out.println();
			i++;

		}

	}

	private static void loopJ(int j, int i) {
		while (j < 5) {
			if (j - i <= 0) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			j++;

		}

	}

}
