package NumberProgram;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int num=scanner.nextInt();
		
		if (num%2==0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		scanner.close();
	}

}
