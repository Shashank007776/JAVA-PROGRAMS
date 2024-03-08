import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		PowerofNumberOfDigits c1 = new PowerofNumberOfDigits();
		int res = c1.count(n);
		c1.power(n, res);
		scan.close();

	}

}
