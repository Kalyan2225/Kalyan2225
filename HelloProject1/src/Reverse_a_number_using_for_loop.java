
public class Reverse_a_number_using_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int rem = 0;
		int sum = 0;
		for (; num > 0;) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;

		}
		System.out.print(sum);
	}

}
