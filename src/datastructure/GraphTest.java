package datastructure;

public class GraphTest {
    public static void main(String[] args) {
        // adjacency matrix = An 2D array that to store 1's and 0's to represent edges between nodes
        //                    # of rows = # of unique nodes
        //                    # of columns = # of unique nodes

        //                    runtime complexity = O(1)
        //                    space complexity = O(n²)

       // Graph graph = new Graph(5);

        //graph.addNode(new Node('A'));
        //graph.addNode(new Node('B'));
        //graph.addNode(new Node('C'));
        //graph.addNode(new Node('D'));
        //graph.addNode(new Node('E'));

        //graph.addEdge(0,1);
        //graph.addEdge(1,2);
        //graph.addEdge(2,3);
        //graph.addEdge(2,4);
        //graph.addEdge(4,0);
        //graph.addEdge(4,2);

        //graph.print();

        //System.out.println(graph.checkEdge(2,1));

        //adjacency list = An array/arraylist of linked liskedlist.
        //                  Each LikedList has a unique node at the head.
        //                  All adjacent neighbors to that node are added to that node's linkedList

        //                  runtime complexity: O(n)
        //                  space complexity: O(n + e)

        int[] array = new int[5];
        Graph graph1 = new Graph();
        graph1.addNode(new Node('A'));
        graph1.addNode(new Node('B'));
        graph1.addNode(new Node('C'));
        graph1.addNode(new Node('D'));
        graph1.addNode(new Node('D'));

        graph1.addEdge(0,1);
        graph1.addEdge(1,2);
        graph1.addEdge(1,4);
        graph1.addEdge(2,3);
        graph1.addEdge(2,4);
        graph1.addEdge(4,0);
        graph1.addEdge(4,2);

        graph1.print();


    }
}
