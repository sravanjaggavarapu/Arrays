package arrayspaper;
//Q 26 Divide an Array to Even Array and Odd Array
import java.util.Arrays;

public class EvenAndOddArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 90, 67, 34, 56, 45 };
		int count=0;
		int count1=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0)
				count++;
			else
				count1++;
		}
		int[] even= new int[count];
		int[] odd= new int[count1];
		int j=0,k=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0)
				even[j++]=arr[i];
			else
				odd[k++]=arr[i];
		}
		System.out.println("Even Array : "+Arrays.toString(even));
		System.out.println("Odd Array : "+Arrays.toString(odd));
			}

}
