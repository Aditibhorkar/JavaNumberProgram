package NumberProgram1;

public class CoundOfDigit {
	
	public static void main(String[] args) {
		
		int num=123654;
		int ct=0;
		while (num!=0) {
			num/=10;
			ct++;
		}
		System.out.println("The count of number is : "+ct);
	}

}
