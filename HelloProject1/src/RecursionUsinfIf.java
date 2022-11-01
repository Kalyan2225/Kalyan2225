
public class RecursionUsinfIf {
	public static void main(String[] args) {
		loopI(0);
	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if (i < 9) {
			loopJ(0, i);
			System.out.println();

			i++;
			LoopI(i);

		}
	}

	private static void LoopJ(int j, int i) {
		// TODO Auto-generated method stub
		if (j < 5) {
			if (j - i <= 0 && j + i <= 8) {
				System.out.print("*");

			} else {
				System.out.print(" ");
			}
			j++;
			LoopJ(j, i);
		}
	}

}
