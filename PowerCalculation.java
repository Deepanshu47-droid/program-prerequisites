import java.util.Scanner;
public class PowerCalculation{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double base,exponent,power;
		System.out.print("Enter base: ");
		base=sc.nextDouble();
		System.out.print("Enter exponent: ");
		exponent=sc.nextDouble();
		power=base;
		for(int i=1;i<exponent;i++)
		{
			power=power*base;
		}
		
		System.out.print("Power is = ");
		System.out.print(power);
	}
}