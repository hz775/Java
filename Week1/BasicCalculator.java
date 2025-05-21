import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;
        System.out.printf("Addition: %.2f\n", addition);
        System.out.printf("Subtraction: %.2f\n", subtraction);
        System.out.printf("Multiplication: %.2f\n", multiplication);
		if (number2 != 0) {
            division = number1 / number2;
            System.out.printf("Division: %.2f\n", division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
        
    }
}

