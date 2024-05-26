package NumberProgram;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		int add = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				add = add + i;
			}
		}
		if (add == num) {
			System.out.println("number is perfect number");
		} else {
			System.out.println("Number is not perfect");
		}
		scanner.close();
	}
}