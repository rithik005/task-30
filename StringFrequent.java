package StringBuilder;

public class StringFrequent {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("programming");

		for (int i = 0; i < sb.length(); i++) {

			char ch = sb.charAt(i);

			int count = 0;

			for (int j = 0; j < sb.length(); j++) {

				count = sb.charAt(j) == ch ? count + 1 : count;
			}

			System.out.println(ch + " = " + count);
		}

	}

}
