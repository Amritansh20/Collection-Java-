package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {

    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue(); //min heap
        Queue<Integer> queue = new PriorityQueue(Comparator.reverseOrder()); //max heap
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(7);
        queue.add(4);
        queue.add(7);
        queue.add(0);

        System.out.println(queue);

    }


}
