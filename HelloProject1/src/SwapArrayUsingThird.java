
public class SwapArrayUsingThird {
	public static void main(String args[]) {

		int a[] = { 1, 8, 5, 7, 1, 9, 4, 7 };
		int i = 0;
		int j = a.length - 1;

		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;

		}
		for (int num : a) {
			System.out.print(num + " ");
		}
// for(int p=0;p<a.length;p++)
//{
//System.out.print(a[p]+" ");	
//}
	}
}
