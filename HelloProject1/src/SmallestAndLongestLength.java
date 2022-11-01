import java.util.Arrays;

public class SmallestAndLongestLength {
	public static void main(String args[]) {
		String s1 = "welcome to java progeamming";
		String sa[] = s1.split(" ");
		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				if (sa[i].length() > sa[j].length()) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(sa));
		System.out.println("Smallest string :" + sa[0]);
		System.out.println("longest string : " + sa[sa.length]);
	}
}
