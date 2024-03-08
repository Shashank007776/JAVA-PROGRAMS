import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		PowerofTwo p1 = new PowerofTwo();
		p1.calculatePowerofTwo(n);
		scan.close();

	}

}
