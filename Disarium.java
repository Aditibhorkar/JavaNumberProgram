package NumberProgram1;

import java.util.Scanner;

public class Disarium {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		int num1 = num, number = num, ct = 0;
		while (num != 0) {
			num /= 10;
			ct++;
		}
		int ans = 0;
		while (num1 != 0) {
			int rem = num1 % 10;
			int product = 1;
			for (int i = 1; i <= ct; i++) {
				product = rem * product;
			}
			ct--;
			ans = ans + product;
			num1 /= 10;
		}
		if (ans == number) {
			System.out.println("Disarium Number");
		} else {
			System.out.println("Not a Disarium Number");
		}
		scanner.close();
	}
}
