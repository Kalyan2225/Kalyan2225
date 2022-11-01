public class PimeNumber {
	public static void main(String args[]) {
		int num = 9;
		myCode(num);
	}

	public static void myCode(int num) {
		int cnt = 0;
		for (int x = 2; x < num; x++) {
			if (num % x == 0)
				cnt++;

		}
		if (cnt == 0) {

			System.out.println("prime number");
		} else {

			System.out.println("not prime number");
		}
	}
}
