import java.util.Scanner;
public class SimpleInterest{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double principal,rate,time,si;
		System.out.print("Enter principal: ");
		principal=sc.nextDouble();
		System.out.print("Enter rate: ");
		rate=sc.nextDouble();
		System.out.print("Enter height: ");
		time=sc.nextDouble();
		si=(principal*rate*time)/100.0;
		System.out.print("simple interest = ");
		System.out.print(si);
	}
}