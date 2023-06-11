package arrayspaper;

// Q.28 Merging Of two Arrays into Single Array
import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 6 };
		int arr2[] = new int[arr1.length * 2];
		System.out.println(arr2.length);
		arr2[arr2.length - 1] = arr1[arr1.length - 1];
		System.out.println(Arrays.toString(arr2));
		/*
		 * int[] arr2 = { 6, 7, 8, 9, 10 }; int[] arr = new int[arr1.length +
		 * arr2.length]; //System.out.println(arr.length); int k =0; for (int i = 0; i
		 * <= arr1.length - 1; i++) arr[k++] = arr1[i]; for (int i = 0; i <= arr1.length
		 * - 1; i++) arr[k++] = arr2[i];
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */
	}

}
