package NumberProgram1;

import java.util.Scanner;

public class Buzz {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		if (num%10==7 || num%7==0) {
			System.out.println("Number is Buzz");
		} else {
			System.out.println("Number is not Buzz");
		}
		scanner.close();
	}

}
