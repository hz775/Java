import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base: ");
		double base=sc.nextDouble();
		System.out.println("Enter Height: ");
		double height=sc.nextDouble();
		double area=0.5*base*height;
		System.out.println("The area of triangle is: "+area);
	}
