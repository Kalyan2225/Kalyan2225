
public class LeastOfsubarray {
	public static void main(string[] args) {
		int arr[] = { 3, 7, 90, 20, 5, 50, 40 };
		int k = 3;

		int min = Integer.MAX_VALUE;
		System.out.println(min);
		int index = 0;
		for (int i = 0; i < a.length - k; i++) {
			int sum = 0;
			int cnt = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + arr[j];
				cnt++;

			}
			int avg = sum / cnt;
			if (min > avg) {
				min = avg;
				index = i;

			}

		}
		System.out.println(min);
		System.out.println(index);

	}
}
