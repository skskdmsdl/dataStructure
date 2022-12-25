import java.util.Queue;
import java.util.Stack;

public class QueueAndStack {

    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();
        Stack<String> stack = new Stack<>();

        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        stack.push("0");
        stack.push("1");
        stack.push("2");

        System.out.println("--- Queue ---");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        // --- Queue ---
        // 0
        // 1
        // 2

        System.out.println("--- Stack ---");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        // --- Stack ---
        // 2
        // 1
        // 0
    }
}