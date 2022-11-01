package collection;

import java.util.HashSet;

public class Compare_to_array_using_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs1 = new HashSet<Integer>();

		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(900);
		hs1.add(7500);

		HashSet<Integer> hs2 = new HashSet<Integer>();

		hs2.add(10);
		hs2.add(20);
		hs2.add(30);
		hs2.add(900);
		hs2.add(7500);

		int cnt = 0;
		for (int data : hs1) {
			if (hs2.contains(data)) {
				cnt++;

			}

		}
		if (cnt == hs1.size())
			System.out.println(true);
		else
			System.out.println(false);

	}

}
