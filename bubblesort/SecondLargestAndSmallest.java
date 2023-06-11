package bubblesort;

import java.util.Arrays;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = { 60, 36, 57, 45, 59 };
		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) 
			for (int j = i + 1; j <= arr.length - 1; j++) 
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		System.out.println(Arrays.toString(arr));
		System.out.println("second largest element in the array :" + arr[1]);
		System.out.println("second samllest element in array :" + arr[arr.length - 2]);
	}
}
