import java.util.Scanner;
public class AverageOfThreeNumbers{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double a,b,c,average;
		System.out.print("Enter first number: ");
		a=sc.nextDouble();
		System.out.print("Enter second number: ");
		b=sc.nextDouble();
		System.out.print("Enter third number: ");
		c=sc.nextDouble();
		average=(a+b+c)/3.0;
		System.out.print("Average of three numbers is ");
		System.out.print(average);
	}
}