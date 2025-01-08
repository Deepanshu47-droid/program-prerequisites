import java.util.Scanner;
public class KilometerToMiles{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double km,miles;
		System.out.print("Enter distance in kilometers: ");
		km=sc.nextDouble();
		miles=km*0.621371;
		System.out.print("Distance in miles = ");
		System.out.print(miles);
	}
}