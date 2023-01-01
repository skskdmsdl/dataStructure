// 1) 헤더 생성
private class myLinkedList{
    private Node header;
    private int size;

    public myLinkedList(){
        header = new Node(null);
        size = 0;
    }

    // 2) 연결할 노드 작성
    private class Node{
        private Object data;
        private Node nextNode;

        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }

    // 3) 데이터를 저장
    public void addFirst(Object data){
        Node newNode = new Node(data);
        newNode.nextNode = header.nextNode;
        header.nextNode = newNode;
        size++;
    }
    public void addLast(Object data){
        add(size, data);
    }
    public void add(Object data){
        addLast(data);
    }

    // 4) 특정 위치에 데이터를 저장 (중간 삽입)
    public void add(int index, Object data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node previous = getNode(index - 1);
        Node next = previous.nextNode;
        Node newNode = new Node(data);
        previous.nextNode = newNode;
        newNode.nextNode = next;
        size++;
    }

    // 5) 데이터 꺼내기
    public Node getNode(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        Node node = header.nextNode;
        for(int i=0; i <index; i++){
            node = node.nextNode;
        }
        return node;
    }
    public Object get(int index){
        return getNode(index).data;
    }
    public Object getFirst(){
        return get(0);
    }

    // 6) 데이터 위치 탐색
    public int getNodeIndex(Object data) {
        if(size<=0)
            return -1;
        int index=0;
        Node node = header.nextNode;
        Object nodeData = node.data;
        while(data.equals(nodeData)) {
            node = node.nextNode;
            if(node == null) {
                return -1;
            }
            nodeData = node.data;
            index ++;
        }
        return index;
    }

    // 7) 데이터 삭제
    public Object removeFirst(){
        Node firstNode = getNode(0);
        header.nextNode = firstNode.nextNode;
        size--;
        return firstNode.data;
    }
    public boolean remove(Object data){
        int nodeIndex = getNodeIndex(data);
        if(nodeIndex == -1){
            return false;
        } else{
            remove(nodeIndex);
            return true;
        }
    }
    public Object removeLast(){
        return remove(size-1);
    }

    // 8) 데이터 삭제 (특정 위치)
    public Object remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        } else if(index==0){
            return removeFirst();
        }
        Node previous = getNode(index-1);
        Node removeNode = previous.nextNode;
        Node next = removeNode.nextNode;
        previous.nextNode = next;
        size--;
        return removeNode.data;
    }

    // 실행
    public static class linkedListTest{
        public static void main(String[] args) {
            myLinkedList ml = new myLinkedList();
            ml.add("Mt.Everest");
            ml.add("K2");
            ml.add("Kanchenjunga");
            ml.add("Lhotse");
            ml.add("Makalu");
            ml.add("Cho oyu");
            ml.add("Dhaulagiri");
            ml.add("Manaslu");
            ml.add("Nanga Parbat");
            ml.add("Annapurna I");
            ml.add("Gasherbrum I");
            ml.add("Brad Peak");

            System.out.println("---- Highest Mountains ----");
            for (int i=0; i<=ml.size-1; i++) {
                System.out.println(ml.get(i));
            }
            System.out.println("---- Highest Mountains (except 3,4) ----");
            ml.remove(2);
            ml.remove(3);
            for (int i=0; i<=ml.size-1; i++) {
                System.out.println(ml.get(i));
            }
            System.out.println("---- Highest Mountains (except 1,3,4,12) ----");
            ml.removeFirst();
            ml.removeLast();
            for (int i=0; i<=ml.size-1; i++) {
                System.out.println(ml.get(i));
            }
        }
    }
}
