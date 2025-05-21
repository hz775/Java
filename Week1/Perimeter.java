import java.util.Scanner;
public class Perimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Perimeter of square: ");
		double Perimeter=sc.nextDouble();
		double Side=Perimeter/4;
		System.out.println("The length of the side is " + Side + " whose perimeter is " + Perimeter);
	}
}