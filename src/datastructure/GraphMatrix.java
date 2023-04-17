package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphMatrix {
    ArrayList<Node> nodes;

    int[][] matrix;

    GraphMatrix(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination){
       return matrix[source][destination] == 1;
    }

    public void print(){
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //depth first search = pick a route, keep going.
    //                      if you reach a dead end, or an already visited node,
    //                      backtrack to previous node with unvisited adjacent neighbors
    public void depthFirstSearch(int source){
        boolean[] vised = new boolean[matrix.length];
        dfsHelper(source, vised);
    }
    private void dfsHelper(int source, boolean[] visited){
        if(visited[source] == true){
            return;
        }
        else{
            visited[source] = true;
            System.out.println(nodes.get(source).data + " = visited");
        }

        for(int i =0; i < matrix[source].length; i++){
            if(matrix[source][i] == 1){
                dfsHelper(i, visited);
            }
        }
        return;
    }
}
