package StringBuilder;

public class StringCompression {

	public static void main(String[] args) {
		
		String str = "aaabbccccd";

		StringBuilder result = new StringBuilder();

		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			boolean same = i < str.length() - 1
					&& str.charAt(i) == str.charAt(i + 1);

			count = same ? count + 1 : count;

			result.append(same ? "" : str.charAt(i));
			result.append(same ? "" : count);

			count = same ? count : 1;
		}

		System.out.println("Original: " + str);
		System.out.println("Compressed: " + result);

	}

}
