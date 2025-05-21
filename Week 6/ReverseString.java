import java.util.Stack;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        
        Stack<Character> st = new Stack<>();
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        System.out.print("Reversed String: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop()); 
        }
        
        sc.close(); 
    }
}
