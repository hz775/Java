import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    public QueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

     public void enqueue(int value) {
        stackEnqueue.push(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        return stackDequeue.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }

        return stackDequeue.peek();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());    
        System.out.println(queue.dequeue()); 

        queue.enqueue(40);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 

        System.out.println(queue.isEmpty()); 
    }
}
