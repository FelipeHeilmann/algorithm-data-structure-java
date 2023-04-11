package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elaptime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //*******************LinkedList*******************
        startTime = System.nanoTime();
        linkedList.get(999999);
        endTime = System.nanoTime();
        elaptime = endTime - startTime;
        System.out.println("LinkedList:\t"+ elaptime + "ns");

        //*******************ArrayList*******************
        startTime = System.nanoTime();
        arrayList.get(999999);
        endTime = System.nanoTime();
        elaptime = endTime - startTime;
        System.out.println("ArrayList:\t"+ elaptime + "ns");
    }
}
