import java.util.Scanner;
public class PerimeterOfRectangle{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double length,width,perimeter;
		System.out.print("Enter length: ");
		length=sc.nextDouble();
		System.out.print("Enter width: ");
		width=sc.nextDouble();
		perimeter=2*length*width;
		System.out.print("Perimeter of rectangle is ");
		System.out.print(perimeter);
	}
}