
public class RecurssionPrintHello {
	public static void main(String[] args) {
		LoopI(0);

	}

	private static void loopI(int i) {
		while (i < 3) {
			loopJ(0);
			i++;
		}

	}

	private static void loopJ(int j) {
		// TODO Auto-generated method stub
		while (j < 2) {
			System.out.println("hello");
			j++;

		}
	}

}
