import java.util.Stack;

/**
 * InbuiltStack
 */
public class InbuiltStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
    }
}