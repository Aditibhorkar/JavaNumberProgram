package NumberProgram;

import java.util.Scanner;

public class TechNumber {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scanner.nextInt();
		int num1=num;
		int ct=0,div=1;
		
		while(num1!=0)
		{
			num1/=10;
			ct++;
		}
		if (ct%2==0) {
			for (int i = 0; i < ct/2; i++) {
				div=div*10;
			}
			int n1=num%div;
			int n2=num/div;
			int add=n1+n2;
			int sqr=add*add;
			if (sqr==num) {
				System.out.println("Number is tech number...");
			} else {
				System.out.println("Number is not tech number...");
			}
		} else {
			System.out.println("Number is not tech number...");
		}
		
		scanner.close();
	}

}
