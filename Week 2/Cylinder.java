import java.util.Scanner;
public class Cylinder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Cylinder: ");
		double radius=sc.nextDouble();
		System.out.println("Enter height of Cylinder: ");
		double height=sc.nextDouble();
		double volume = Math.PI * Math.pow(radius, 2) * height;
		System.out.println("The volume of the Cylinder is: "+volume);
	}
}
		


		