import java.util.Scanner;
public class AddTwoNumbers{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.print("Enter first number: ");
		a=sc.nextDouble();
		System.out.print("Enter second  number: ");
		b=sc.nextDouble();
		System.out.print("Sum of two numbers is ");
		System.out.println(a+b);
	}
}