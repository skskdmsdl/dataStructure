// PriorityQueue - Queue내의 데이터를 순서대로 정렬하여 꺼내줌
public static void main(String[] args){
        PriorityQueue<Integer> intQueue = new PriorityQueue<Integer>();
        intQueue.offer(30);
        intQueue.offer(20);
        intQueue.offer(5);
        intQueue.offer(50);
        intQueue.offer(40);

        int len = intQueue.size();
        for(int i =0; i<len ; i++){
        System.out.println(intQueue.poll());
        }
        // 5
        // 20
        // 30
        // 40
        // 50

        PriorityQueue<String> sQueue = new PriorityQueue<String>();
        sQueue.offer("CDE");
        sQueue.offer("ABC");
        sQueue.offer("FGH");
        sQueue.offer("CCE");
        System.out.println(sQueue.poll());
        System.out.println(sQueue.poll());
        System.out.println(sQueue.poll());
        sQueue.offer("CCE");
        // ABC
        // CCE
        // CDE
        // FGH
}