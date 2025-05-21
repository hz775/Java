public class Main {
    public static String reversedString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "Hemanth";
        String reversed = reversedString(input);
        System.out.print("reversed: " + reversed);
    }
}