package StringBuilder;

public class PalindromeExample {

	public static void main(String[] args) {
		
		String str = "madam";

		StringBuilder sb = new StringBuilder(str);

		boolean palindrome = true;

		for (int i = 0; i < sb.length() / 2; i++) {

			palindrome = sb.charAt(i) == sb.charAt(sb.length() - 1 - i)
					? palindrome : false;
		}

		System.out.println("Original: " + str);
		System.out.println("Palindrome: " + palindrome);

	}

}
