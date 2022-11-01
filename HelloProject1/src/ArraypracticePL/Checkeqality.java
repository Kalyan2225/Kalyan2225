package ArraypracticePL;

public class Checkeqality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 7 };
		int b[] = { 1, 3, 5, 7 };
		int cnt = 0;

		if(a.length==b.length)
		{
			loopI(0,a,cnt);	
		}
		else
		{
			System.out.println("not equal by length");
		}
	}

/*
 * if (a.length == b.length) { for (int i = 0; i < a.length; i++) { if (a[i] ==
 * a[i]) { continue; } else { cnt++; break; } } if (cnt == 0) {
 * System.out.println("same");
 * 
 * } else { System.out.println("not same"); } } else {
 * System.out.println("Not equal by length"); } }
 * 
 * }
 */
