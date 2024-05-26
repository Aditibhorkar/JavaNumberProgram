package NumberProgram;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scanner.nextInt();
		int num1=num;
		int rev=0;
		while (num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		if (rev==num1) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
		scanner.close();
	}

}
