package decimaltobinary;

public class ArrayBinaryDemo {

	public static void main(String[] args) {
		int[] arr = { 22, 123, 140, 47, 98, 56 };
		String bin = "";
		System.out.println("Binary Values : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			int OriginalNumber = arr[i];
			while (arr[i] > 0) {
				int r = arr[i] % 2;
				bin = r + bin;
				arr[i] = arr[i] / 2;
			}
			System.out.println(OriginalNumber + "------>" + Integer.parseInt(bin));
			bin="";
		}

	}

}
