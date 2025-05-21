import java.util.Scanner;
public class WeightOfPerson{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight in pounds: ");
		double pounds=sc.nextDouble();
		double kg=pounds/2.2;
		System.out.println("The weight of the person in pound is "+pounds+"in kg is "+kg);
	}
}