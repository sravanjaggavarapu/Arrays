package factorial;

public class ArrayFactorial {

	public static void main(String[] args) {
		int[] arr = { 24, 34, 56, 89, 456, 3, 4, 5 };
		for (int i = 0; i <= arr.length - 1; i++) {
			double fact = 1;
			for (int j = 1; j <= arr[i]; j++)
				fact = fact * j;
			System.out.println(arr[i] + "! =" + fact);

		}

	}
}