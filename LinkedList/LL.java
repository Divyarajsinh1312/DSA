package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0; 
    }

    public void insertHead(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertTail(int value){
        if (tail == null) {
            insertHead(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if (index == 0) {
            insertHead(value);
            return;
        }
        if (index == size) {
            insertTail(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        } 

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
