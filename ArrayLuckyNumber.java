package luckynumber;

public class ArrayLuckyNumber {

	public static void main(String[] args) {
		int[] arr = { 23, 56, 68, 45, 1998 };
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			int OriginalNumber = arr[i];
			while (arr[i] > 0) {
				int r = arr[i] % 10;
				sum = sum + r;
				arr[i] = arr[i] / 10;
			}
			int sum1 = 0;
			while (sum > 0) {
				int r1 = sum % 10;
				sum1 = sum1 + r1;
				sum = sum / 10;
			}
			System.out.println("Lucky Number for " + OriginalNumber + " : " + sum1);
		}

	}

}
