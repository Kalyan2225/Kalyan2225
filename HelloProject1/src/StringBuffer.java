public class MyClass {
	public static void main(String[] args) {
		// easy.2
		String[] names1 = { "hefshine", "JBK", "other" };
		StringBuffer names[] = new StringBuffer[3];
		for (int i = 0; i < names1.length; i++) {
			names[i] = new StringBuffer(names1[i]);
		}
		MovieCapacity.print(names, 5);
		MovieCapacity.print(names, 95);
	}
}

class MovieCapacity {

	public static void print(StringBuffer[] names, int j) {
		for (StringBuffer name : names) {
			name.ensureCapacity(j);
			System.out.print(name + " capacity- " + name.capacity() + " ");
		}
		System.out.println();
	}
}
