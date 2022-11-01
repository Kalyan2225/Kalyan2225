package ArraypracticePL;

public class Left_rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 3, 5, 9, 8, 7, 1 };

		int temp = b[0];

		loopI(0, b, temp);
		b[b.length - 1] = temp;
		loopJ(0, b);
	}

	private static void loopJ(int i, int[] b) {
		// TODO Auto-generated method stub
		if (i < b.length) {
			System.out.print(b[i] + " ");
			i++;
			loopJ(i, b);
		}

	}

	private static void loopI(int i, int[] b, int temp) {
		if (i < b.length - 1) {
			b[i] = b[i + 1];
			i++;
			loopI(i, b, temp);
		}
	}
}
/*
 * 
 * for (int i = 0; i < b.length - 1; i++) { b[i] = b[i + 1]; } b[b.length - 1] =
 * temp;
 * 
 * for (int j = 0; j < b.length; j++) { System.out.print(b[j] + " "); }
 * 
 * }
 * 
 * }
 */