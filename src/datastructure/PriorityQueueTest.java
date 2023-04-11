package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        // Priority Queue = FIFO data structure that servers elements with the highest priorities first before elements
        //                  with lower priority
        //      Collections.reverseOrder() is an argument passed in the constructor to reverse the sorting of priority queues
        Queue<String> queue = new PriorityQueue<>();
        Queue<Double> queue2 = new PriorityQueue<>();

         queue.offer("Felipe");
         queue.offer("Mateus");
         queue.offer("Victor");
         queue.offer("Vinicius");
         queue.offer("Bruno");

         queue2.offer(3.5);
         queue2.offer(5.0);
         queue2.offer(2.5);
         queue2.offer(6.0);
         queue2.offer(1.5);


        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}
