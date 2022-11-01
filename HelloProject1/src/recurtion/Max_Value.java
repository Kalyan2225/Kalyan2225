package recurtion;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome";

		int index = 2;
		char[] ch = s.toCharArray();
		loopI(0, index, ch);

	}

	private static void loopI(int i, int index, char[] ch) {
		if (i < ch.length) {
			if (i == index) {
				System.out.println(ch[i]);

			}
			i++;
			loopI(i, index, ch);
		}
	}

}
