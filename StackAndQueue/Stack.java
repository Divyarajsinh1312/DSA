package StackAndQueue;

public class Stack {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(10);
        stack.push(20);
        System.out.println("POP: " + stack.pop());
        System.out.println(stack.peek());
    }

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Cannot pop from an empty stack!!");
        }
        return data[ptr--];
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}
