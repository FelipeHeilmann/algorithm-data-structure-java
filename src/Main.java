import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        // Stack = LIFO data structure . LIFO -> Last-in First-out
        //      stores objects into a sort of "vertical tower"
        //      push() to add to top
        //      pop() to remove from the top
        //      peek() get the first element in the stack without removing
        //      search() get the item that you are looking for
        //      first index is 1

        //    Stack<String> stack = new Stack<String>();

        //      stack.push("Minecraft");
        //      stack.push("Skyrim");
        //      stack.push("DOOM");
        //      stack.push("Borderlands");
        //      stack.push("FFVII");

        //      System.out.println(stack);

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

        //      queue.offer("Ana");
        //      queue.offer("Victor");
        //      queue.offer("Felipe");
        //      queue.offer("Vinicius");

        //      queue.poll();
        //      System.out.println(queue.isEmpty());
        //      System.out.println(queue.size());

        //      System.out.println(queue);
        //********************************************************************



        // Priority Queue = FIFO data structure that servers elements with the highest priorities first before elements
        //                  with lower priority
        //      Collections.reverseOrder() is an argument passed in the constructor to reverse the sorting of priority queues
        //      Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());

        //      queue.offer(3.0);
        //      queue.offer(2.5);
        //      queue.offer(4.0);
        //      queue.offer(1.5);
        //      queue.offer(2.0);

        //      while(!queue.isEmpty()){
        //      System.out.println(queue.poll());
        //      }
        //********************************************************************



        // LinkedList = stores Nodes in two parts (data + address)
        //      Nodes are non-consecutive memory locations
        //      Elements are linked using pointers
        //                          Singly Linked list:
        //         Node                   Node                     Node
        //   [ data | address]   ->   [ data | address]    ->     [ data | address]
        //
        //                          Doubly Linked List:
        //               Node                               Node                                Node
        //   [ address | data | address]   <->   [ address | data | address]   <->    [ address | data | address]
        //
        //      You can work with a linkedlist either as a queue or a stack, by using their own methods
        //         LinkedList<String> linkedList = new LinkedList<>();
        //

        //       Stack:
        //       linkedList.push("A");
        //       linkedList.push("B");
        //       linkedList.push("C");
        //       linkedList.push("D");
        //       linkedList.push("F");
        //       linkedList.pop();
        //
        //       System.out.println(linkedList);

        //      Queue
        //       linkedList.offer("A");
        //       linkedList.offer("B");
        //       linkedList.offer("C");
        //       linkedList.offer("D");
        //       linkedList.offer("F");

        //       linkedList.add(4, "E");
        //       linkedList.remove(4);
        //       System.out.println(linkedList.indexOf("F"));
        //       System.out.println(linkedList.peekFirst());
        //       System.out.println(linkedList.peekLast());

        //       linkedList.addFirst("0");
        //       linkedList.addLast("G");
        //       System.out.println(linkedList);
        //********************************************************************

        //       DynamicArray dynamicArray = new DynamicArray(5);
        //        dynamicArray.add("A");
        //        dynamicArray.add("B");
        //        dynamicArray.add("C");
        //        dynamicArray.add("D");
        //        dynamicArray.add("E");
        //
        //        dynamicArray.delete("A");
        //        dynamicArray.delete("B");
        //        dynamicArray.delete("C");
        //        dynamicArray.delete("D");
        //        dynamicArray.insert(0, "X");
        //        dynamicArray.delete("X");
        //        System.out.println(dynamicArray.search("C"));

        //      System.out.println(dynamicArray);
        //       System.out.println(dynamicArray.isEmpty());

    }
}