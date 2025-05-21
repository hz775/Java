package polymorphism;

import java.util.Stack;

public class parenthesisChecker {
    public static void main(String[] args) {
        String str = "[}]{()";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else if (!st.isEmpty() &&
                    ((ch == ']' && st.peek() == '[') ||
                     (ch == '}' && st.peek() == '{') ||
                     (ch == ')' && st.peek() == '('))) {
                st.pop();
            } else {
                st.push(ch); 
            }
        }

        if (st.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
