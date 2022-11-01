package collection;

import java.util.HashSet;

public class Print_element_size_hasset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(900);
		hs.add(7500);

		int size = hs.size();
		System.out.println(size);

		for (int data : hs) {
			System.out.println(data);
		}
	}

}
