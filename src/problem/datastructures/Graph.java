package problem.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<N> {

    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addBidirectionalEdge(N node1, N node2) {
        this.addNode(node1);
        this.addNode(node2);
        this.adjacencyList.get(node1).add(node2);
        this.adjacencyList.get(node2).add(node1);
    }

    public void addNode(N a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }

    public HashMap<N, ArrayList<N>> getAdjacencyList() {
        return adjacencyList;
    }

    @Override
    public String toString() {
        return this.adjacencyList.toString();
    }


}
