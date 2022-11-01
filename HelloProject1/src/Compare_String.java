public class Compare_String {
	public static void main(String[] args) {
		String s1 = "aknfjnabcdmead@nd";
		String s2 = "abcd";

		System.out.println(s1.compareTo(s2));
		System.out.println(myownStartwith(s1, s2));
	}

	private static boolean myownStartwith(String s1, String s2) {
		if (s2.length() > s1.length())
			return false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				int j = i + 1;
				int k = 1;
				int count = 1;

				while (k < s2.length() && j < s1.length()) {
					if (s1.charAt(j) == s2.charAt(k))
						count++;
					else
						break;
					k++;
					j++;

				}
				if (count == s2.length())
					return true;
				else
					continue;

			}
		}

		return false;
	}
}