package NumberProgram1;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		
		int sqaure = num*num;
		int ans=0;
		while (sqaure!=0) {
			int rem=sqaure%10;
			ans=ans+rem;
			sqaure/=10;
		}
		if (ans==num) {
			System.out.println("number is neon");
		} else {
			System.out.println("number is not neon");
		}
		scanner.close();
	}

}
