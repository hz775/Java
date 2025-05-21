import java.util.Scanner;
public class NumberOfStudents{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("The no of students: ");
		int n=sc.nextInt();
		int NoOfhandshakes=(n*(n-1))/2;
		System.out.println("number of possible handshakes is : "+NoOfhandshakes);
	}
}
		
		