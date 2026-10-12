package StringBuilder;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String str = "programming";

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			boolean found = false;

			for (int j = 0; j < result.length(); j++) {

				found = result.charAt(j) == ch ? true : found;
			}

			result.append(found ? "" : ch);
		}

		System.out.println("Original: " + str);
		System.out.println("Result: " + result);

	}

}
