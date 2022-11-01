
public class SortStringBynumber {
	public static void main(String args) {
		String s1 = "4321";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}

			}

		}
		String s2 = new String(ch);
		System.out.println(s2);

	}

}
