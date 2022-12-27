import java.util.*

public class LinkedList {
    public static void main(String[] args) {

        // 선언
        LinkedList list = new LinkedList(); // 타입 미설정 Object로 선언된다
        LinkedList<Student> members = new LinkedList<Student>(); // 타입설정 Student객체만 사용 가능
        LinkedList<Integer> num = new LinkedList<Integer>(); // 타입설정 int타입만 사용 가능
        LinkedList<Integer> num2 = new LinkedList<>(); // new에서 타입 파라미터 생략 가능
        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,2)); // 생성시 값 추가

        // 값 추가
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1); // 가장 앞에 데이터 추가
        list.addLast(2); // 가장 뒤에 데이터 추가
        list.add(3); // 데이터 추가
        list.add(1, 10); // index 1에 데이터 10 추가

        // 값 삭제
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
        list.removeFirst(); // 가장 앞의 데이터 제거
        list.removeLast(); // 가장 뒤의 데이터 제거
        list.remove(); // 생략시 0번째 index제거
        list.remove(1); // index 1 제거
        list.clear(); // 모든 값 제거
    }
}