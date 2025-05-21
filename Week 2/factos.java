import java.util.Scanner;
public class factos{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter no:");
		int num = obj.nextInt();
		int temp = num;
		int fact = 1;
		while(temp>0){
			fact = fact*temp;
			temp--;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}
}