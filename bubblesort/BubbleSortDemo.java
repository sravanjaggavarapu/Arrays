package bubblesort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 8, 2, 5 };
		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
