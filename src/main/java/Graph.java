import java.util.*;

public class Graph{
    private final Map<Integer, Set<Integer>> adj = new HashMap<>();

    public void addVertex(int vertex) {
        adj.putIfAbsent(vertex, new HashSet<>());
    }

    public void addEdge(int source, int destination) {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    public void removeVertex(int vertex) {
        if (adj.containsKey(vertex)) {
            adj.get(vertex).forEach(adjacency -> adj.get(adjacency).remove(vertex));
            adj.remove(vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (adj.containsKey(source)) {
            adj.get(source).remove(destination);
        }
        if (adj.containsKey(destination)) {
            adj.get(destination).remove(source);
        }
    }

    public boolean hasVertex(int vertex) {
        return adj.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adj.containsKey(source) && adj.get(source).contains(destination);
    }

    public void printGraph() {
        adj.forEach((key, value) -> System.out.println(key + " -- " + value));
    }
}
