package NumberProgram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = scanner.nextInt();
		int add = 0, num1 = num;
		while (num != 0) {
			int factorial = 1;
			int rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				factorial = factorial * i;
			}
			add = add + factorial;
			num /= 10;
		}
		if (add == num1) {
			System.out.println("Number is strong number");
		} else {
			System.out.println("Number is not strong number");
		}
		scanner.close();
	}

}
