package NumberProgram;

import java.util.Scanner;

public class BouncyNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scanner.nextInt();
		
		boolean inc=false,dec=false;
		int last=num%10;
		while (num!=0) {
			num/=10;
			int secLast=num%10;
			if (last>secLast) {
				dec=true;
			} else if (last<secLast) {
				inc=true;
			} 
			
			if (inc && dec) {
				break;
			} else {
				last=secLast;
			}
		}
		if (inc && dec) {
			System.out.println("Number is bouncy");
		}
		else
		{
			System.out.println("Number is not bouncy");
		}
		
	}
}
