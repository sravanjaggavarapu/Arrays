package decimaltobinary;

import java.util.Scanner;

public class BinaryDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Positive Number : ");
		int n = sc.nextInt();
		String bin = "";
		while (n > 0) {
			int r = n % 2;
			bin = r + bin;
			n = n / 2;
		}
		System.out.println(Integer.parseInt(bin));
		sc.close();
	}

}
