package com.TemparatureConvertor.convertFahrenheittocelsius;

public class TemparatureConvertor {
   public double convertFahrenheitToCelsius(double fahrenheit) {
	   double celsius = (fahrenheit - 32)* 5/9;
	   return celsius;
			   
   }
}
