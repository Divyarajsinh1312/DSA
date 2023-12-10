package LinkedList;

public class Doubly {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertHead(3);
        list.insertHead(5);
        list.insertHead(10);
        list.insertHead(17);
        list.insertTail(100);
        list.insertTail(200);
        list.insertAfterNode(300, 3);
        list.display();
        list.displayRev();

    }
}

public class  DLL {

    private Node head;

    public void insertHead(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertTail(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
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

    public void insertAfterNode(int value, int afterVal){
    Node temp = find(afterVal);

    if (temp == null) {
        System.out.println("Node with value " + afterVal + " does not exist");
        return;
    }

    Node node = new Node(value);
    node.next = temp.next;
    node.prev = temp;
    
    if (temp.next != null) {
        temp.next.prev = node;
    }
    
    temp.next = node;
}


    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> " );
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            node = node.next;
        }
        
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }

    private class  Node {
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }



        public Node(int value, Node next, Node prev){
            this.value = value; 
            this.next = next;
            this.prev = prev;
        }
        
    }
    
}
