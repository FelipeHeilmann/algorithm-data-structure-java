package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphList {
    //adjacency list = An array/arraylist of linked liskedlist.
    //                  Each LikedList has a unique node at the head.
    //                  All adjacent neighbors to that node are added to that node's linkedList

    //                  runtime complexity: O(n)
    //                  space complexity: O(n + e)
    ArrayList<LinkedList<Node>> alist;
    GraphList(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int source, int destination) {
        LinkedList<Node> currentList = alist.get(source);
        Node destiNode = alist.get(destination).get(0);
        currentList.add(destiNode); //adding the node at the tail of the linkedlist
    }

    public boolean checkEdge(int source, int destination){
        LinkedList<Node> currentList = alist.get(source);
        Node destiNode = alist.get(destination).get(0);
        for(Node node: currentList){
            if(node== destiNode) {
                return true;
            }
        }
        return false;
    }

    public void print(){
        for (LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }


}
