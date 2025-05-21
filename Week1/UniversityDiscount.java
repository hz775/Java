import java.util.Scanner;
public class UniversityDiscount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fees: ");
		double fee=sc.nextDouble();
		System.out.println("Enter DiscountPercent:");
		double discountPercent=sc.nextDouble();
		double Discount=(fee*discountPercent)/100;
		double DiscountPercent=fee-Discount;
		System.out.println("The discount amount is INR" +Discount+"and final discounted fee is INR"+DiscountPercent);
	}
}

		