package StringBuilder;

public class NoRepeated {

	public static void main(String[] args) {
		
		String str = "swiss";

		StringBuilder sb = new StringBuilder(str);

		char result = ' ';

		for (int i = 0; i < sb.length(); i++) {

			int count = 0;

			for (int j = 0; j < sb.length(); j++) {

				count = sb.charAt(j) == sb.charAt(i)
						? count + 1 : count;
			}

			result = count == 1 ? sb.charAt(i) : result;
		}

		System.out.println("First Non-Repeated Character: " + result);

	}

}
