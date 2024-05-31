package NumberProgram;

import java.util.Scanner;

public class EvenOddWithoutMod {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = scanner.nextInt();
		
		if ((num/2)*2==num) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}
