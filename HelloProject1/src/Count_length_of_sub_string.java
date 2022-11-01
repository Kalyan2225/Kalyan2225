
public class Count_length_of_sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcab";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					cnt++;
			}
		}
		System.out.println(cnt + s.length());

	}

}
