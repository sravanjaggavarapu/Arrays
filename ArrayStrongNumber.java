package strongNumber;

public class ArrayStrongNumber {

	public static void main(String[] args) {
		int[] arr = { 23, 145, 35, 67, 56, 43 };
		for (int i = 0; i <= arr.length - 1; i++) {
			int sum = 0;
			int OriginalNumber = arr[i];
			while (arr[i] > 0) {
				int r = arr[i] % 10;
				int fact = 1;
				for (int j = r; j > 0; j--)
					fact = fact * j;

				sum = sum + fact;
				arr[i] = arr[i] / 10;

			}
			if (OriginalNumber == sum)
				System.out.println(OriginalNumber + " is Strong Number");
			else
				System.out.println(OriginalNumber + " is NOT a Strong Number");
			arr[i] = OriginalNumber;
		}
	}
}
