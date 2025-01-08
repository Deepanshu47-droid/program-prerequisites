import java.util.Scanner;
public class CelsiusToFahrenheit{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature in celsius: ");
		double cel=sc.nextDouble();
		double fah=(cel*9.0/5.0)+32.0;
		System.out.print("Temperature in fahrenheit is ");
		System.out.print(fah);
	}
}