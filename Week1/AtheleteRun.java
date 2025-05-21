import java.util.Scanner;
public class AtheleteRun{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		int perimeter=side1+side2+side3;
		double rounds=5000/perimeter;
		System.out.println("The total mum of rounds the athelete will run is "+rounds+"to complete 5 Km");
	}
}