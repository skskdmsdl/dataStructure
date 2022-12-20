import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {

        Queue queue = new LinkedList(); // 타입 설정x Object로 입력
        Queue<QueueDemo> demo = new LinkedList<QueueDemo>(); // 타입을 QueueDemo클래스로 설정

        Queue<Integer> i = new LinkedList<Integer>(); // Integer타입으로 선언
        Queue<Integer> i2 = new LinkedList<>(); // new부분 타입 생략 가능
        Queue<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3)); // 선언과 동시에 초기값 세팅

        Queue<String> str = new LinkedList<String>(); // String타입 선언
        Queue<Character> ch = new LinkedList<Character>(); // Character타입 선언

    }
}
