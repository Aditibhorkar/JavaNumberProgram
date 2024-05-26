package NumberProgram1;

import java.util.Scanner;

public class Pronic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		int i;
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				if (num % (i + i) == 0) {
					System.out.println("Number is pronic");
					break;
				}
			}
		}
		if (i == num) {
			System.out.println("Number is not pronic");
		}
		scanner.close();
	}
}
