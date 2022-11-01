
public class CompareWithRightElement {
	public static void main(String args[]) {
		int a[] = { 9, 14, 240, 11, 20, 120 };
		for (int i = 0; i < a.lemgth; i++) {
			int cnt = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
