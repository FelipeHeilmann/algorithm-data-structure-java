import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //********************************************************************
        // Stack = LIFO data structure . LIFO -> Last-in First-out
        //      stores objects into a sort of "vertical tower"
        //      push() to add to top
        //      pop() to remove from the top
        //      peek() get the first element in the stack without removing
        //      search() get the item that you are looking for
        //      first index is 1
        //
        //    Stack<String> stack = new Stack<String>();
        //
        //      stack.push("Minecraft");
        //      stack.push("Skyrim");
        //      stack.push("DOOM");
        //      stack.push("Borderlands");
        //      stack.push("FFVII");
        //
        //      System.out.println(stack);
        //
        //********************************************************************

        //********************************************************************
        // Queue = FIFO data structure. FIFO -> First-in First-out
        //      A collection designed for holding elements prior processing
        //      Linear data structure
        //      is an interface so we cant create an objetc of it, we can a class that implements it
        //      add = enqueue, offer()
        //      remove = dequeue, poll()
        //      size() returns the size of the queue
        //      isEmpty() returns if the queue is empty
        //      contains() returns if the queue contains the object
        //      Queue<String> queue = new LinkedList<>();
        //
        //      queue.offer("Ana");
        //      queue.offer("Victor");
        //      queue.offer("Felipe");
        //      queue.offer("Vinicius");
        //
        //      queue.poll();
        //      System.out.println(queue.isEmpty());
        //      System.out.println(queue.size());
        //
        //
        //      System.out.println(queue);
        //********************************************************************

        // Priority Queue = FIFO data structure that servers elements with the highest priorities first before elements
        //                  with lower priority
        //      Collections.reverseOrder() is an argument passed in the constructor to reverse the sorting of priority queues
        //      Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());
        //
        //      queue.offer(3.0);
        //      queue.offer(2.5);
        //      queue.offer(4.0);
        //      queue.offer(1.5);
        //      queue.offer(2.0);

        //      while(!queue.isEmpty()){
        //      System.out.println(queue.poll());
        //      }



    }
}