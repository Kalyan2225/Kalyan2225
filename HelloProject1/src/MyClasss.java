public class MyClasss {

	public static void main(String[] args) {
		// CoS.3
		int n = 7;
		int limit = 4;
		myCode(n, limit);

	}

	public static void myCode(int n, int limit) {
		do {
			System.out.println("n = " + n);
			n--;
		} while (n > limit);

	}
}
