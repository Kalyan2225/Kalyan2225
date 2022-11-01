package recurtion;

public class StartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "programming";
		String s2 = "prog";
		System.out.println(s1.startsWith(s2));
		if (s2.length() <= s1.length()) {
			int cnt = 0;
			cnt = loopI(0, cnt, s2, s1);
			if (cnt == s2.length()) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		} else {
			System.out.println(false);
		}
	}

	private static int loopI(int i, int cnt, String s2, String s1) {
		if (i < s2.length()) {
			if (s1.charAt(i) == s2.charAt(i))
				cnt++;
			{
				i++;
				cnt = loopI(i, cnt, s2, s1);

			}

		}
		return cnt;

	}

}
