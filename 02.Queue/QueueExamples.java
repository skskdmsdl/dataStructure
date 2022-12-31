// 1) Create : 빈 큐를 생성
public class myQueue{
    private int front;
    private int rear;
    private int maxSize;
    private Object[] queyeArray;

    public myQueue(int maxSize){
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.queyeArray = new Object[maxSize];
    }

    // 2) Empty : 큐가 비어있는지 확인
    public boolean empty(){
        return (front == rear +1);
    }
    public boolean full(){
        return (rear == maxSize-1);
    }


    // 3) Insert : 큐에 자료를 삽입
    public void insert(Object item){
        if(full())
            throw new ArrayIndexOutOfBoundsException();
        queyeArray[++rear] = item;
    }

    // 4) Peek : 자료를 유지하면서
    public Object peek(){
        if(empty())
            throw new ArrayIndexOutOfBoundsException();
        return queyeArray[front];
    }

    // 5) Remove : 큐에서 자료를 하나 삭제
    public Object remove(){
        Object item = peek();
        front++;
        return item;
    }

    // 실행
    public static class QueueTest{
        public static void main(String[] args){
            myQueue mq = new myQueue(15);
            mq.insert("Hello--");
            mq.insert("Hi--");
            mq.insert("JAVA");
            System.out.println(mq.remove());
            System.out.println(mq.remove());
            System.out.println(mq.remove());
        }
    }
}
