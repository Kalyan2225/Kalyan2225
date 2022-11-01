package collection;
import java.util.HashSet;
public class hashset_convert_into_clone_by_creating_obj_and_use_typecast {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				HashSet<Integer> hs = new HashSet<Integer>();

				hs.add(10);
				hs.add(20);
				hs.add(30);
				hs.add(900);
				hs.add(7500);

				System.out.print(hs);
				HashSet<Integer>hs1=(HashSet<Integer>)hs.clone();
				System.out.println(hs1);
				}
			}

		}
