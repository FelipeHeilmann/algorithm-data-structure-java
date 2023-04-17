package datastructure;

public class GraphMatrixTest {
    public static void main(String[] args) {
        // adjacency matrix = An 2D array that to store 1's and 0's to represent edges between nodes
        //                    # of rows = # of unique nodes
        //                    # of columns = # of unique nodes

        //                    runtime complexity = O(1)
        //                    space complexity = O(n²)

        GraphMatrix graph = new GraphMatrix(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        System.out.println(graph.checkEdge(2,1));

        graph.breadthFirstSearch(3);
    }
}
