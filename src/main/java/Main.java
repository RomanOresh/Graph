import java.util.*;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);

        System.out.println("Созданный граф");
        graph.printGraph();
        System.out.println("Существует ли в графе ребро 1-2: " + graph.hasEdge(1,2)
        + ". Существует ли в графе вершина 1: " + graph.hasVertex(1));


        graph.removeEdge(1,2);
        System.out.println("Граф после удаления ребра 1-2");
        graph.printGraph();
        System.out.println("Существует ли в графе ребро 1-2 после удаления: " + graph.hasEdge(1,2));

        graph.removeVertex(1);
        System.out.println("Граф удаления вершины 1");
        graph.printGraph();
        System.out.println("Существует ли в графе вершина 1 после удаления: " +graph.hasVertex(1));







    }
}
