package NumberProgram1;

import java.util.Scanner;

public class SpyNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		int add=0,product=1;
		while (num!=0) {
			add=add+(num%10);
			product=product*(num%10);
			num/=10;
		}
		if (add==product) {
			System.out.println("Number is spy");
		} else {
			System.out.println("Number is not a spy");
		}
		scanner.close();
	}

}
