package bubblesort;

public class SecondLargestWithoutTwoLoops {

	public static void main(String[] args) {
		int[] arr = { 56, 78, 98, 22, 85 };
		int largest = 0;
		int secondlargest = 0;
		for (int i = 0; i <= arr.length - 1; i++)
			if (largest < arr[i]) {
				secondlargest=largest;
				largest = arr[i];
			}
			else if (secondlargest < arr[i])
				secondlargest = arr[i];
		System.out.println("SecondLargest Element in the given array :" + secondlargest);
	}
}
