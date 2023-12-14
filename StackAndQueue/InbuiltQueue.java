import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(35);
        System.out.println(queue.remove());
    }
}
