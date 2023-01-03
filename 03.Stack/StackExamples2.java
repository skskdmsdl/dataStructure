// Stack API Sample
import java.util.Stack;

public class stackSample {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        for(int i=1; i<=5; i++){
            stack.push("데이터-" + i);
        }
        stack.push("데이터-6");
        System.out.println(stack.pop());
        // 데이터-6
        System.out.println(stack.pop());
        // 데이터-5
        System.out.println(stack.peek());
        // 데이터-4
        System.out.println(stack.peek());
        // 데이터-4
        System.out.println(stack.pop());
        // 데이터-4
        System.out.println(stack.pop());
        // 데이터-3
        System.out.println(stack.pop());
        // 데이터-2
        System.out.println(stack.pop());
        // 데이터-1

        Stack st = new Stack();
        st.push("0");
        st.push("1");
        st.push("2");

        System.out.println("=stack=");
        while(!st.empty()){
            System.out.println(st.pop());
            // 2
            // 1
            // 0
        }
    }
}