import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();
		Armstrong a1 = new Armstrong();
		boolean res = a1.isArmstrong(n);
		scan.close();
		if(res) {
			System.out.println("The "+n+" is Armstrong");
		}
		else {
			System.out.println("The "+n+" is not Armstrong");
		}

	}

}
