package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        // Queue = FIFO data structure. FIFO -> First-in First-out
        //      A collection designed for holding elements prior processing
        //      Linear data structure
        //      is an interface so we cant create an object of it, we can use a class that implements it
        //      add = enqueue, offer()
        //      remove = dequeue, poll()
        //      size() returns the size of the queue
        //      isEmpty() returns if the queue is empty
        //      contains() returns if the queue contains the object

        Queue<String> queue = new LinkedList<>();

        queue.offer("Ana");
        queue.offer("Victor");
        queue.offer("Felipe");
        queue.offer("Vinicius");

        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        System.out.println(queue);

    }
}
