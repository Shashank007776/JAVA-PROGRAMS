import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		CountNumberofDigits c1 = new CountNumberofDigits();
		c1.count(n);
		scan.close();

	}

}
