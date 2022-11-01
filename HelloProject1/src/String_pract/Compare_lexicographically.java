package String_pract;

public class Compare_lexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
		String s2 = "abcD";
		int cnt = 0;

		int i = 0;
		while (i < s1.length() && i < s2.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				cnt++;
			} else {
				System.out.println(s1.charAt(i) - s2.charAt(i));
				break;

			}
			i++;
		}
		if (cnt == s1.length() || cnt == s2.length()) {
			System.out.println("len diff : " + (s1.length() - s2.length()));

		}

	}
}
