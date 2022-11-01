package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverseelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a1 = new ArrayList<Integer>();

		a1.add(10);
		a1.add(20);
		a1.add(30);

		Collections.reverse(a1);
		System.out.println(a1);

	}

}
