package NumberProgram;

import java.util.Scanner;

public class Armstrong {
	
	private static int ct=0;

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scanner.nextInt();
		int num1=num,num2=num;
		while (num2!=0) {
			num2/=10;
			ct++;
		}
		int add=0;
		while(num1!=0)
		{
			int rem=num1%10;
			int power=1;
			for (int i = 0; i < ct; i++) {
				power=power*rem;
			}
			num1/=10;
			add=add+power;
		}
		if (add==num2) {
			System.out.println("Number is an armstrong");
		} else {
			System.out.println("Number is not an armstrong");
		}
		scanner.close();
	}
}
