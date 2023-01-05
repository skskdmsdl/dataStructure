public class linkedListSample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        // [100, 200, 300, 400, 500]

        list.add(2,300);
        list.addFirst(50);
        System.out.println(list);
        // [50, 100, 200, 300, 300, 400, 500]

        System.out.println(list.get(4));
        // 300

        list.remove(2);
        list.remove(new Integer(400));
        System.out.println(list);
        // [50, 100, 300, 300, 500]

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        // [100, 300, 300]

        System.out.println("size: "+list.size());
        // size: 3
    }
}