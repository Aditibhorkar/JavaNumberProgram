package NumberProgram;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scanner.nextInt();
		
		while(num!=0)
		{
			int rem=num%10;
			if (rem==0) {
				System.out.println("Number is not duck number");
				break;
			}
			num/=10;
		}
		if (num==0) {
			System.out.println("Number is duck number");
		}
		scanner.close();
	}

}
