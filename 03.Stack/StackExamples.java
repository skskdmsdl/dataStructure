public class myStack {
    // 1) Create : 빈 스택 생성
    private Object[] stackArray; // 데이터 저장을 위한 배열 선언
    private int maxSize; // 배열의 최대 사이즈
    private int top; // 마디막 데이터의 위치

    public myStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }

    // 2) Empty : 스택이 비어있는지 체크
    public boolean empty() {
        return (top == -1);
    }

    // 3) Push : 스택에 자료를 삽입
    public boolean full() {
        return (top == maxSize - 1);
    }

    public void push(Object item) {
        if (full())
            throw new ArrayIndexOutOfBoundsException((top + 1) + ">=" + maxSize);
        stackArray[++top] = item;
    }

    // 4) Peek : 데이터 유지하면서 꺼내기 (top의 데이터 하나를 읽음)
    public Object peek() {
        if (empty())
            throw new ArrayIndexOutOfBoundsException(top);
        return stackArray[top];
    }

    // 5) Pop : 스택에서 자료를 하나 삭제
    public Object pop() {
        Object item = peek();
        top--;
        return item;
    }

    // 실행

    public static void main(String[] args){
        myStack stack = new myStack(10);
        for(int i=1; i<=5; i++){
            stack.push("데이터 : "+ i);
        }
        stack.push("데이터 : 6");
        System.out.println(stack.pop());
        // 데이터 : 6
        System.out.println(stack.pop());
        // 데이터 : 5
        System.out.println(stack.peek());
        // 데이터 : 4
        System.out.println(stack.peek());
        // 데이터 : 4
        System.out.println(stack.pop());
        // 데이터 : 4
        System.out.println(stack.pop());
        // 데이터 : 3
        System.out.println(stack.pop());
        // 데이터 : 2
        System.out.println(stack.pop());
        // 데이터 : 1

        // Stack을 활용한 연산차 후치 표기법 수행
        // (5_7) * 8 => 57+8*
        myStack as = new myStack(15);
        as.push(5);
        as.push(7);
        as.push((Integer)as.pop() + (Integer)as.pop());
        as.push(8);
        as.push(Integer.parseInt(as.pop().toString())
                * Integer.parseInt(as.pop().toString()));
        System.out.println(as.peek());
    }
}