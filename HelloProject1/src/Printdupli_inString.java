
public class Printdupli_inString {
	public static void main(String args[]) {
		String s = "abadabadabca";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int cnt = 0;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.chatAt(j))
					cnt++;

			}
			if (cnt > 0) {
				s1 = s1 + s.charAt(i);

			}
			System.out.println(s1);

		}

	}

}
