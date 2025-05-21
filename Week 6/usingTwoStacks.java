import java.util.Stack;

public class usingTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val) {
        stack1.push(val);
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Cannot dequeue value. Queue is empty.");
                return;
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("Dequeued: " + stack2.pop());
    }

    public static void main(String[] args) {
        usingTwoStacks q1 = new usingTwoStacks();
        q1.enqueue(10);
        q1.enqueue(12);
        q1.enqueue(14);

        q1.dequeue();  
        q1.enqueue(15);
        q1.dequeue();  
        q1.dequeue();  
        q1.dequeue();  

        q1.dequeue();  
    }
}
