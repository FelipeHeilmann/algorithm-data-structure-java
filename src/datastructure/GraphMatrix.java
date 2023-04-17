package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    //depth first search =  transverse a graph branch by branch
    //                      utilizes stacks
    //                      better if destination is on average far from the start
    //                      children are visited before siblings
    //                      pick a route, keep going.
    //                      if you reach a dead end, or an already visited node,
    //                      backtrack to previous node with unvisited adjacent neighbors
    //
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
    //breadth first search = traverse a graph by level
    //                       utilizes queues
    //                       better if destination is on average close to start
    //                       siblings ara visited before children
    public void breadthFirstSearch(int source){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(source);
        visited[source] = true;
        while(queue.size() != 0){
            source = queue.poll();
            System.out.println(nodes.get(source).data + " = visited");
        for (int i =0; i < matrix[source].length; i++){
                if(matrix[source][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
