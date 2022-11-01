
public class RecirsionForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		loopI(i);
	}

	private static void loopI(int i) {
		if (i < 5) {
			int j = 0;
			loopJ(j, i);
			System.out.println();
			i++;
			loopI(i);

		}
	}

	private static void loopJ(int j, int i) {
		// TODO Auto-generated method stub

	}

}
