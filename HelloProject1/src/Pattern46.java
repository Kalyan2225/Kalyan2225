
public class Pattern46 {
	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			int cnt2 = cnt;
			int diff = 4;
			for (int j = 0; j < 5; j++) {
				if (j - i <= 0) {
					System.out.print(cnt2 + " ");

				} else {
					System.out.print(" ");

				}
				cnt2 = cnt2 + diff;
				diff--;
			}
			cnt++;
			System.out.println();
		}
	}
}
