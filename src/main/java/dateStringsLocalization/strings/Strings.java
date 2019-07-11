package dateStringsLocalization.strings;

public class Strings {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

		boolean b1 = s1 == s2; // true
		boolean b2 = s1 == s3; // false
	}

	private void concat() {
		String a = "1" + 2 + 3; // 123
		String b = 1 + 2 + "3"; // 33
	}

	private void stringBuilderStringBuffer() {
		/*
		 * String builder is better when the string changes a lot, because its mutable,
		 * but, it's not thread safe. String buffer is thread safe.
		 */
		
		StringBuilder sb = new StringBuilder("abcde");
		sb.insert(3, '-'); // a-bcde
		sb.delete(3, 4); // a-bde
		System.out.println(sb.toString());
		System.out.println(sb.substring(2, 4)); // starts at pos 2 and goes until pos 3
	}

}
