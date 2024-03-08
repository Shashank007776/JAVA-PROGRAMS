import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter the number which it has to be raised ");
		int n = scan.nextInt();
		Powerofn p1 = new Powerofn();
		p1.power(num, n);
		scan.close();
				

	}

}
