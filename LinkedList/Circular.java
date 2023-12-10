package LinkedList;

public class Circular {

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertion(10);
        list.insertion(20);
        list.insertion(30);
        list.display();
        list.delete(10);
        list.display();
    }
}

public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertion(int value){
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void delete(int value){
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display(){
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("END");
    }

    private class  Node {
        int value;
        Node next;

        public Node (int value){
            this.value = value;
        }
    }
}
