package datastructure;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
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

        LinkedList<String> linkedListStack = new LinkedList<>();
        //

        //       Stack:
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        linkedListStack.push("D");
        linkedListStack.push("F");
        linkedListStack.pop();
        System.out.println(linkedListStack);


        LinkedList<String> linkedListQueue = new LinkedList<>();
        //      Queue
        linkedListQueue.offer("A");
        linkedListQueue.offer("B");
        linkedListQueue.offer("C");
        linkedListQueue.offer("D");
        linkedListQueue.offer("F");

        linkedListQueue.add(4, "E");
        linkedListQueue.remove(4);
        System.out.println(linkedListQueue.indexOf("F"));
        System.out.println(linkedListQueue.peekFirst());
        System.out.println(linkedListQueue.peekLast());

        linkedListQueue.addFirst("0");
        linkedListQueue.addLast("G");
        System.out.println(linkedListQueue);
    }
}
