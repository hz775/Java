import java.util.Scanner;
public class Income{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double salary=sc.nextDouble();
		double bonus=sc.nextDouble();
		double TotalIncome=salary+bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + "/nHence Total Income is INR " + TotalIncome);
	}
}