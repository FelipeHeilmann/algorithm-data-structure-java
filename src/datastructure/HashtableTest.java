package datastructure;

import java.util.Hashtable;

public class HashtableTest {
    public static void main(String[] args) {
        //      Hashtable = data structure that stores unique keys to values ex. <Integer, String>
        //                  Each key/value pair is known as an Entry
        //                  FAST insertion, look up, deletion of keys/value pair
        //                  Not ideal for small data sets, great with large data sets

        //      hashing = sakes a key and computes an integer (formula will vary based on keys & data types)
        //                In a hashtable, we use (hash % capacity) to calculate the index number
        //                                       key.hashCode() % capacity = index

        //      bucket = an index storage location for one or more Entries. Can store multiple Entries in case of
        //      a collision (linked similar to a LinkedList)

        //      collision = hash functions generates the same index for more than one key
        //                  less collisions = more efficiency

        //      run time complexity: Best case O(1) = no collisions
        //                           Worst case O(n)

        //Hashtable<Integer, String> table = new Hashtable<>(10);
        Hashtable<String, String> table = new Hashtable<>();
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Garry");

        //     table.remove(777);

        for(String key : table.keySet()){
            System.out.println( key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
        }

    }
}
