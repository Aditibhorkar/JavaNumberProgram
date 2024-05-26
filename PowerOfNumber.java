package NumberProgram1;

import java.util.Scanner;

public class PowerOfNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base=scanner.nextInt();
		System.out.println("Enter the power");
		int power=scanner.nextInt();
		int ans=1;
		for (int i = 0; i < power; i++) {
			ans=ans*base;
		}
		System.out.println(base+"^"+power+" : "+ans);
		scanner.close();
	}

}
