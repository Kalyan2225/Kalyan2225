package thread;

class A implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}

public class TestMyclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		t1.start();
		t2.start();

	}

}
