package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<Node> nodes;
    ArrayList<LinkedList<Node>> alist;
    int[][] matrix;

    Graph(){
        alist = new ArrayList<>();
    }
    //Graph(int size){
        //nodes = new ArrayList<>();
        //matrix = new int[size][size];
    //}

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
        //nodes.add(node);
    }

    public void addEdge(int source, int destination){
        LinkedList<Node> currentList = alist.get(source);
        Node destiNode = alist.get(destination).get(0);
        currentList.add(destiNode); //adding the node at the tail of the linkedlist

        //matrix[source][destination] = 1;
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
        //System.out.print("  ");
        //for(Node node : nodes){
            //System.out.print(node.data + " ");
        //}
        //System.out.println();

        //for(int i = 0; i < matrix.length; i++){
            //System.out.print(nodes.get(i).data + " " );
            //for(int j = 0;  j < matrix[i].length; j++){
                //System.out.print(matrix[i][j] + " ");
            //}
            //System.out.println();
        //}

        for (LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }
}
