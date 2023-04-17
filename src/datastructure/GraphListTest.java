package datastructure;

public class GraphListTest {
    public static void main(String[] args) {
        GraphList graph1 = new GraphList();
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
