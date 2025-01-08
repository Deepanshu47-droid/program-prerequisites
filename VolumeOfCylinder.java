import java.util.Scanner;
public class VolumeOfCylinder{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		double radius,height,volume;
		System.out.print("Enter the radius of the cylinder: ");
		radius=sc.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		height=sc.nextDouble();
		volume=(22.0/7.0)*radius*radius*height;
		System.out.print("volume of the cylinder is ");
		System.out.print(volume);
		
	}
}
		