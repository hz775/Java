import java.util.Scanner;
public class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        double distanceInCm = distanceInFeet * 30.48;
        double distanceInInches = distanceInFeet * 12;
        System.out.println("Your Height in cm is " + distanceInCm + " cm");
        System.out.println("Your Height in feet is " + distanceInFeet + " feet");
        System.out.println("Your Height in inches is " + distanceInInches + " inches");
        System.out.println("Distance in Yards: " + distanceInYards + " yards");
        System.out.println("Distance in Miles: " + distanceInMiles + " miles");
    }
}
