import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: "+simpleInterest);
    }
}
