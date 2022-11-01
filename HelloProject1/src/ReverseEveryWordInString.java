
public class ReverseEveryWordInString {

	String s1 = "he is a good boy";
	String[] s2 =s1.split(" ");for(
	int i = 0;i<s2.length;i++)System.out.println(i+" "+s2[i]);}System.out.println("********");for(
	int i = 0;i<s2.length;i++)
	{
		String temp = s2[i];
		char ch[] = temp.toCharArray();
		int start = 0;
		int end = ch.length - 1;
		while (start < end) {
			char c = ch[start];
			ch[start] = ch[end];
			ch[end] = c;
			start++;
			end--;

		}
		String s4 = new String(ch);
		s2[i] = s4;

	}

}
