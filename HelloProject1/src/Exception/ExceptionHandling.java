package Exception;

import java.nio.channels.AlreadyBoundException;

public class ExceptionHandling {

	static void m1() {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		try {

			System.out.println(a[7]);
		} catch (AlreadyBoundException e) {
			System.out.println("Please give correct index");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		m1();
		System.out.println("hii");

	}

}
