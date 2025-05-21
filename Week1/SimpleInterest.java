import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Principal=sc.nextInt();
		int Rate=sc.nextInt();
		int Time=sc.nextInt();
		double simpleInterest=Principal*Rate*Time/100;
		System.out.println("The Simple Interest is "+simpleInterest+"for Principal "+Principal+","+"Rate of Interest "+Rate+"and Time "+Time);
	}
}