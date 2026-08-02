package DAY_9;
import java.util.*;

public class P1_Min_Heap {
    public static void main() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);

        System.out.println(minHeap.peek());
        minHeap.poll();
        System.out.println(minHeap.peek());
    }
}
