
public class PatternCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int cnt = 1;
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					System.out.print(cnt++);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
