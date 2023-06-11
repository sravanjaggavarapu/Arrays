package binarytodecimal;

import java.util.Scanner;

public class DecimalDemo {

	public static void main(String[] args) {
		// Formula : decimal=decimal+remainder*base

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary value : ");
		int n = sc.nextInt();
		int base = 1;
		int dec = 0;
		int OriginalNumber = n;
		while (n > 0) {
			int r = n % 10;
			dec = dec + r * base;
			base = base * 2;
			n = n / 10;
		}
		System.out.println(OriginalNumber + "---->" + dec);
		sc.close();
	}

}
