package com.TemparatureConvertor.convertFahrenheittocelsius;
import java.util.Scanner;
public class TemparatureConvertorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Fahrenheit to convert into Celsius : ");
		double fahrenheit = scan.nextDouble();
		TemparatureConvertor temparatureconvertor = new TemparatureConvertor();
		System.out.println("The Temparature afte converting from Fahrenheit to Celsius is : "+temparatureconvertor.convertFahrenheitToCelsius(fahrenheit));
		scan.close();
}
}
