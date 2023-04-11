package datastructure;

public class DyamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new datastructure.DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.insert(0, "X");
        dynamicArray.delete("X");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());

    }
}
