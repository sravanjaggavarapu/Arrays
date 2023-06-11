package bubblesort;

public class FirstAndLastDigit {
	public static void main(String[] args) {

		int n = 12345, first = 0, base = 1, number = 0;
		int last = n % 10;
		while (n > 10)
		{
			n = n / 10;
			if (n > 9) 
			{
				first = n % 10;
				base = base * 10;
				number = base * first + number;
			} 
			else 
			{
				first = n % 10;
				base = base * 10;
			}

		}
		number = last * base + number + first;
		System.out.println(number);

	}

}
