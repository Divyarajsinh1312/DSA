package LinkedList;

public class singly {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(100);
        list.insertTail(5);
        list.insertTail(20);
        list.insert(7, 2);
        list.Display();
        System.out.println(list.deleteHead());
        list.Display();
        System.out.println(list.deleteLast());
        list.Display();
        System.out.println(list.delete(2));
        list.Display();
        System.out.println(list.find(7));
    }
}

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

    public int deleteHead(){
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteHead();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if (index == 0) {
            return deleteHead();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public void Display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value){
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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

