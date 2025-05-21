public class UniversityFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discount;

        System.out.println("The Discounted Amount is INR " + discount);
        System.out.println("The Discounted Price the Student will Pay is INR " + discountedPrice);
    }
}
