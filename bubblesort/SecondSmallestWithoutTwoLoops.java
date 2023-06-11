package bubblesort;

public class SecondSmallestWithoutTwoLoops {

	public static void main(String[] args) {

		int[] arr = { 8, 3, 4, 2, 5 };
		int smallest = arr[0];
		int secondsmallest = arr[1];
		for (int i = 0; i <= arr.length - 1; i++)
			if (smallest > arr[i])
				smallest = arr[i];
			else if (secondsmallest > arr[i])
				secondsmallest = arr[i];
		System.out.println("Second Smallest Element in the given array :" + secondsmallest);
	}

}
