import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("The given number is Positive");
        } else if (num < 0) {
            System.out.println("The given number is Negative");
        } else {
            System.out.println("The given number is Zero");
        }
        
    }
}

		

		
		