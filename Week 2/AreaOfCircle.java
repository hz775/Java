import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius of the Circle: ");
	double radius=sc.nextDouble();
	double area=Math.PI*radius*radius;
	System.out.println("radius of the Circle is: "+area);
	}
}