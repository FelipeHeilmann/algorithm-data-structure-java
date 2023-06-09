package datastructure;

import java.util.Stack;

public class StackTest {
     public static void main(String[] args) {
         // Stack = LIFO data structure . LIFO -> Last-in First-out
         //      stores objects into a sort of "vertical tower"
         //      push() to add to top
         //      pop() to remove from the top
         //      peek() get the first element in the stack without removing
         //      search() get the item that you are looking for
         //      first index is 1

         Stack<String> stack = new Stack<String>();

         stack.push("Minecraft");
         stack.push("Skyrim");
         stack.push("DOOM");
         stack.push("Borderlands");
         stack.push("FFVII");

         System.out.println(stack);
     }
}
