package palindromeNumber;

public class ArrayPalindromeNumber {

	public static void main(String[] args) {
		int[] arr = { 121, 2233, 4334, 6776, 8901 };
		for (int i = 0; i <= arr.length - 1; i++) {
			int rev = 0;
			int OriginalNumber = arr[i];
			while (arr[i] > 0) {
				int r = arr[i] % 10;
				rev = rev * 10 + r;
				arr[i] = arr[i] / 10;
			}
			if (rev == OriginalNumber)
				System.out.println(OriginalNumber + " is Palindrome");
			else
				System.out.println(OriginalNumber + " is NOT Palindrome");
		}

	}

}
