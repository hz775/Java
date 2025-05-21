import java.util.Stack;

public class SortUsingRecursion {

    
    public static void sort(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int temp = st.pop();                     
        sort(st);                               
        insertAtCorrectPosition(st, temp);       
    }

    public static void insertAtCorrectPosition(Stack<Integer> st, int temp) {
        if (st.isEmpty() || st.peek() < temp) {
            st.push(temp);
            return;
        }

        int element = st.pop();
        insertAtCorrectPosition(st, temp);       
        st.push(element);                        
    }

   
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(13);
        st.push(14);
        st.push(15);

        System.out.println("Original Stack: " + st);
        sort(st);
        System.out.println("Sorted Stack (Ascending): " + st);
    }
}
