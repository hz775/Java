import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the Width of the rectangle: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("The Perimeter of the rectangle is:"+perimeter);
    }
}
