import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base number : ");
		int num = scan.nextInt();
		System.out.println("Enter the number to which the base number has to be raised : ");
		int n = scan.nextInt();
		int result = (int)Math.pow(num, n);
		System.out.println("Result : "+result);
		scan.close();

	}

}
