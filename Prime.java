package NumberProgram;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = scanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		scanner.close();
	}

}
