package collection;

import java.util.HashSet;

public class Add_element_at_last_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(120);

		hs.add(30);

		hs.add(50);

		hs.add(700);
		int ele = 450;
		System.out.println(hs);

		hs.add(ele);

		System.out.println(hs);

	}

}
